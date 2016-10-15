package com.security.web;

import java.io.IOException;

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

public class XssHttpFilter implements Filter {

	protected static final Logger log = LogProxy.getLog();

	private String[] allowedDomain = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("XSS安全过滤器载入");

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

		boolean allow = false;

		if (referer != null && this.allowedDomain != null && isAllowedDomain(referer)) {
			log.info("授信的安全域名:" + referer);
			allow = true;
		} else {
			String uri = request.getRequestURI();
			if (StringUtils.contains(uri, "yeepay")) {
				allow = true;
			}

		}

		if (allow) {

			chain.doFilter(request, response);

		} else {

			chain.doFilter(new XssRequestWrapper(request), response);

		}

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
