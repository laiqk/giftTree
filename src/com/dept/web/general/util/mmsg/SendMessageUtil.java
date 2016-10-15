package com.dept.web.general.util.mmsg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

/**
 * 
 * @ClassName: SendMessageUtil.java
 * @Description: 发送短信彩信工具
 *
 * @author cannavaro
 * @version V1.0
 * @Date 2014-10-10 上午10:57:48 <b>Copyright (c)</b> 雄猫软件版权所有 <br/>
 */
public class SendMessageUtil {

	// //查账户信息的http地址
	// private static String URI_GET_USER_INFO =
	// "https://sms.yunpian.com/v1/user/get.json";

	// 智能匹配模版发送接口的http地址
	private static String URI_SEND_SMS = "https://sms.yunpian.com/v1/sms/send.json";

	// //模板发送接口的http地址
	// private static String URI_TPL_SEND_SMS =
	// "https://sms.yunpian.com/v1/sms/tpl_send.json";
	//
	// //发送语音验证码接口的http地址
	// private static String URI_SEND_VOICE =
	// "https://voice.yunpian.com/v1/voice/send.json";

	// 编码格式。发送编码格式统一用UTF-8
	private static String ENCODING = "UTF-8";

	// 用户唯一标识
	private static String APIKEY = "719a43e9405054c6af13d03efca854f5";

	/**
	 * 智能匹配模版接口发短信
	 *
	 * @param apikey
	 *            apikey
	 * @param text
	 *            　短信内容
	 * @param mobile
	 *            　接受的手机号
	 * @return json格式字符串
	 * @throws IOException
	 */

	public static boolean sendSMS(String mobile, String content) throws IOException {
		boolean result = true;
		Map<String, String> params = new HashMap<String, String>();
		params.put("apikey", APIKEY);
		String sms_signature = "【签名】";// 签名
		String text = sms_signature + content;
		params.put("text", text);
		params.put("mobile", mobile);
		String sms_result = post(URI_SEND_SMS, params);
		String result_code = JSONObject.fromObject(sms_result).getString("code");
		// 发送成功
		if(!"0".equals(result_code)) {
			result = false;
		}
		return result;
	}

	/**
	 * 基于HttpClient 4.3的通用POST方法
	 *
	 * @param url
	 *            提交的URL
	 * @param paramsMap
	 *            提交<参数，值>Map
	 * @return 提交响应
	 */

	public static String post(String url, Map<String, String> paramsMap) {
		CloseableHttpClient client = HttpClients.createDefault();
		String responseText = "";
		CloseableHttpResponse response = null;
		try {
			HttpPost method = new HttpPost(url);
			if (paramsMap != null) {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				for (Map.Entry<String, String> param : paramsMap.entrySet()) {
					NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
					paramList.add(pair);
				}
				method.setEntity(new UrlEncodedFormEntity(paramList, ENCODING));
			}
			response = client.execute(method);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				responseText = EntityUtils.toString(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return responseText;
	}
}
