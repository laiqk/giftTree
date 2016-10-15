package com.dept.web.context;

/**
 * @ClassName: ParameterMsg
 * @Description:
 * @author 一些常量字符信息
 * @version V1.0
 * @Date 2016年08月11日 11:53
 */

public class ParameterMsg {

	// -----------------------------------------------关于用户-----------------------------
	public static String USER_EMAIL_NOTBIND = "请先绑定邮箱";
	
	public static String USER_REALNAME_NOTSUB = "请输入姓名";
	
	public static String USER_IDCARD_NOTSUB = "请输入身份证号码";
	
	public static String USER_REALNAME_VERTIFY = "请先进行实名认证";
	
	public static String USER_REALNAME_VERTIFYING = "实名认证待审核确认";
	
	public static String USER_REALNAME_EXIST = "已完成实名认证";
	
	public static String USER_ISNOT_LOGIN = "您尚未登录，请先登录";
	
	public static String USER_ADDRESS_ISNOTNULL = "居住地址不能为空";
	
	
	
	public static String USER_PASSWORD_ISEMPTY = "密码不能为空 ";
	
	public static String USER_PASSWORD_ISNOTCORRECT = "密码不正确，请输入您的旧密码 ";
	
	public static String USER_PASSWORD_ISNOTREGULAR = "密码格式为6-15位数字与字符组合,不能包含中文和空格";
	
	public static String USER_PASSWORD_ISNOTSAME = "确认密码与新密码不同,请重新输入";
	
	public static String USER_ACCOUNT_ISNOTEXIST = "资金账户不存在";

	public static String USER_ISNOTEXIST = "用户不存在";
	
	public static String USER_ACCOUNT_ERROR = "数据异常";
	
	
	public static String USER_CREDIT_ISNOTEXIST = "金币账户不存在";

	public static String USER_CREDIT_ISLESS = "金币不足";
	
	public static String USER_EXCHANGE_FAIL = "兑换失败";
	
	public static String USER_EXCHANGE_SUCC = "兑换成功";
	
	public static String USER_SIGNIN_SUCC = "签到成功";

	public static String USER_SIGNIN_FAIL = "今天已经签过到了";
	
	// -----------------------------------------------关于登录注册-----------------------------
	public static String REG_USRENAME = "请输入4-16位用户名";
	
	public static String REG_PASSWORD = "请输入6-15位密码";
	
	public static String REG_USERNAME_LESS = "用户名不能少于4位";
	
	public static String REG_USERNAME_MORE = "用户名不能超过16位";
	
	public static String REG_PASSWORD_NOTCHINA = "密码请勿包含中文";
	
	public static String REG_USERNAME_EXISTS = "该用户名已经被注册";
	
	public static String REG_USERNAME_NOTSPEC = "用户名不能含特殊字符";
	
	public static String REG_PASSWORD_EMPTY = "密码不能为空";
	
	public static String REG_PASSWORD_NOTSAME = "两次密码输入不一致";
	
	public static String REG_PHONE_EMPTY = "请输入手机号";
	
	public static String REG_PHONE_NOTCORRECT = "请输入正确的手机号码";
	
	public static String REG_PHONE_EXISTS = "该手机号码已经绑定";
	
	public static String REG_PHONE_USERNAME = "你输入的手机号码已经被注册";
	
	public static String REG_INVITED_NOTEXIST = "你输入的推荐人不存在";
	
	public static String USERNAME_NOTEXIST = "用户名或密码错误";
	
	public static String PASSWORD_ERROR = "密码错误";
	
	public static String REG_SUCCESS = "注册成功";
	
	public static String REG_VERIFY_SUCC = "验证成功"; 
	
	public static String USER_EXIT_SUCCESS = "成功退出登录";
	
	// --------------------------------------------关于传参--------------------------------------
	public static String SYSTEM_PARAMETER_ERROR = "参数传递错误";
	
	public static String SYSTEM_SAVE_SUCCESS = "保存成功";
	
	public static String SYSTEM_UPDATE_SUCCESS = "更新成功";

	// --------------------------------------------关于充值--------------------------------------
	public static String CHAEGE_CHOOSE_METHOD = "请选择充值方式";
	
	public static String CHAEGE_MONEY_MORE = "最低充值金额100元";
	
	public static String CHAEGE_MONEY_LESS = "单笔最高充值金额不超过50000元";
	
	public static String CHAEGE_MONEY_NOTENOUGH = "对不起，您没有足够的 余额,请先充值！";
	
	public static String CHAEGE_FAIL = "充值失败";

	// --------------------------------------------关于支付密码--------------------------------------
	public static String PAYPASSWORD_UPDATE_SUCCESS = "更新支付密码成功";

	// --------------------------------------------关于邮箱--------------------------------------
	public static String MAIL_RECEIVE_ISNULL = "收件人不能为空！";
	
	public static String MAIL_TITLE = "标题不能为空！";
	
	public static String MAIL_CONTENT_ISNULL = "内容不能为空！";
	
	public static String MAIL_RECEIVE_ISNOTEXIST = "收件人不存在";
	
	public static String MAIL_FORMAT_ERROR = "邮箱格式错误";
	
	public static String MAIL_SEND_SUCC = "邮件发送成功";
	
	public static String MAIL_LINK_ERROR = "邮箱激活链接错误，请重新发送";
	
	public static String MAIL_LINK_LATE = "邮箱激活链接已过期，请重新发送";
	
	public static String MAIL_BIND_ISEXIST = "邮箱已有人绑定";
	
	public static String MAIL_BIND_SUCC = "邮箱绑定成功";
	
	public static String MAIL_ISBIND = "您已绑定邮箱";

	// --------------------------------------------关于验证码--------------------------------------
	public static String CODE_ISEXPIRED = "验证码已过期";

	public static String CODE_CANNOTUSE = "验证码已失效";
	
	public static String PHONE_CODE_ISEMPTY = "手机验证码不能为空";
	
	public static String PHONE_CODE_ERROR = "手机验证码错误";
	
	public static String IMAGE_CODE_ERROR = "图片验证码错误";
	
	// --------------------------------------------关于邮箱--------------------------------------
	public static String UPLOAD_SIZE_ISMORE2 = "上传图片不能超过2M！";
	
	// --------------------------------------------数据加载--------------------------------------
	public static String DATA_LOAD_FAIL = "数据加载失败";
	
}
