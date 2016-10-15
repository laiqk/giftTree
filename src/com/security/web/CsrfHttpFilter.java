package com.security.web;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sendinfo.xspring.util.log.LogProxy;

public class CsrfHttpFilter implements Filter {

	protected static final Logger log = LogProxy.getLog();

	private String[] allowedDomain = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("CSRF安全过滤器载入");

		this.allowedDomain = StringUtils.split(filterConfig.getInitParameter("allowedDomain"), ",");

		if (this.allowedDomain != null) {
			for (String name : this.allowedDomain) {
				if (StringUtils.isBlank(name)) {
					log.warn("allowedDomain配置存在空字符串，将成为安全漏洞");
				}
			}
		}
	}

	@Override
	public void doFilter(ServletRequest _request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) _request;
		String referer = request.getHeader("Referer");
		if (referer != null) {
			try {
				if ((this.allowedDomain == null) || (!isAllowedDomain(referer))) {
					String host = request.getHeader("Host");
					if (host != null) {
						boolean find = Pattern.compile("((http://|https://)|/)" + host.replaceAll("\\.", "\\\\.")).matcher(referer).find();

						if (!find) {
							log.warn("疑似跨站点请求伪造攻击（CSRF），请求忽略。(Referer={" + referer + "} ,Host={" + host + "})");
							String URL = request.getRequestURL().toString();
							request.setAttribute("url", URL);
							request.setAttribute("referer", referer);
							request.getRequestDispatcher("/csrf.html").forward(request, response);
							return;
						}
					}
				} else {
					log.info("授信的安全域名:" + referer);
				}
			} catch (Exception e) {
				log.info("CSRF判断失败", e);
			}
		}
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {

	}

	private boolean isAllowedDomain(String domain) {
		for (String name : this.allowedDomain) {
			if (StringUtils.contains(domain, name))
				return true;
		}
		return false;
	}

}
