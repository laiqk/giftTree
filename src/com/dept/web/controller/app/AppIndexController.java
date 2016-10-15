package com.dept.web.controller.app;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dept.web.context.ParameterMsg;
import com.dept.web.controller.WebController;
import com.dept.web.controller.app.model.AppIndex;
import com.dept.web.dao.model.Product;
import com.dept.web.dao.model.Setting;
import com.dept.web.dao.model.app.base.AppDownload;
import com.dept.web.dao.model.app.base.AppDownloadData;
import com.dept.web.service.SystemService;
import com.dept.web.service.business.ProductService;
import com.sendinfo.common.lang.StringUtil;

@Controller
public class AppIndexController extends WebController{
	
	@Autowired
	private SystemService systemService;
	@Autowired
	private ProductService productService;
	/**
	 * app首页
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "app/index")
	public String index(ModelMap map,HttpServletRequest request,HttpServletResponse response) throws Exception {
		AppIndex appIndex = new AppIndex();
		Product product = new Product();
		List<Product> productList = productService.getProducts(product);
		appIndex.setProductList(productList);
		return dataToJson(map, appIndex);
	}
	
	/**
	 * app检查更新
	 * @param map
	 * @param request
	 * @param response
	 * @param appSource
	 * @param appVersion
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("app/checkVersion")
	public String checkVersion(ModelMap map, HttpServletRequest request, HttpServletResponse response,
			@RequestParam String appSource, @RequestParam String appVersion) throws Exception {
		AppDownload appDownload = new AppDownload();
		Setting set = new Setting();
		set.setName("con_app_downloadUrl");
		Setting setDown = systemService.getSetting(set);
		String downloadUrl = "";
		if(setDown!=null)
			downloadUrl = setDown.getValue();//apk下载地址
		set = new Setting();
		set.setName("con_app_version");
		Setting setVersion = systemService.getSetting(set);
		String version = "";
		if(setVersion!=null)
			version = setVersion.getValue();//apk版本
		
		if(StringUtil.isNotBlank(version) && StringUtil.isNotBlank(downloadUrl)) {
			List<AppDownloadData> dataList = new ArrayList<AppDownloadData>();
			AppDownloadData appDownloadData = new AppDownloadData();
		
			appDownloadData.setVersion(version);
			appDownloadData.setDownloadUrl(URLEncoder.encode(downloadUrl,"UTF-8"));

			dataList.add(appDownloadData);
			
			appDownload.setCode(1);
			appDownload.setDataList(dataList);
		} else {
			appDownload.setCode(0);
			appDownload.setMsg(ParameterMsg.DATA_LOAD_FAIL);
		}
		
		return dataToJson(map, appDownload);
	}
	
}