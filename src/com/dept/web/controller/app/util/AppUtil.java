package com.dept.web.controller.app.util;

/**
 * app接口工具类
 * @author lichaoping
 *
 */
public class AppUtil {
	/**
	 * 还款方式
	 * @param borrow
	 * @return
	 */
	public static String getBorrowRepaymentStyle(Integer repaymentStyle) {
		String repayment_style = "";
		if (repaymentStyle == 2) {
			repayment_style = "到期还本付息";
		}
		return repayment_style;
	} 
	
	/**
	 * 借款期限
	 * @param isday
	 * @param timeLimit
	 * @return
	 */
	public static String getBorrowTimeLimit(Integer isday, Integer timeLimit) {
		String borrowTimeLimit = "";
		if (isday == 1) {
			borrowTimeLimit = timeLimit+"天";
		} else {
			borrowTimeLimit = timeLimit+"个月";
		}
		return borrowTimeLimit;
	}
}
