package com.dept.web.general.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumberUtil {

	public static boolean isMoreZero(double num1) {

		if(num1>0){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public static int aMoreb(String num1,String num2) {
		
	    double a = Double.valueOf(num1);
	    double b = Double.valueOf(num2);
		
		if((a-b)>0){
			return 1;
		}else if((a-b)==0){
			return 0;
		}else{
			return -1;
		}
	}
	public static double format(double d,String format){
		DecimalFormat df = new DecimalFormat(format); 
		String ds=df.format(d);
		return Double.parseDouble(ds);
	}
	
	public static double format2(double d){
		DecimalFormat df = new DecimalFormat("0.00"); 
		String ds=df.format(d);
		return Double.parseDouble(ds);
	}
	
	public static String format2Str(double d){
		DecimalFormat df = new DecimalFormat("0.00"); 
		String ds=df.format(d);
		return ds;
	}
	
	public static double format4(double d){
		DecimalFormat df = new DecimalFormat("0.0000"); 
		String ds=df.format(d);
		return Double.parseDouble(ds);
	}
	
	public static double format6(double d){
		DecimalFormat df = new DecimalFormat("0.000000"); 
		String ds=df.format(d);
		return Double.parseDouble(ds);
	}
	
	public static double getDouble(String str){
		if(str==null||str.equals(""))
			return 0.0;
		double ret=0.0;
		try {
			ret=Double.parseDouble(str);
		} catch (NumberFormatException e) {
			ret=0.0;
		}
		return format6(ret);
	}
	public static long getLong(String str){
		if(str==null||str.equals(""))
			return 0L;
		long ret=0;
		try {
			ret=Long.parseLong(str);
		} catch (NumberFormatException e) {
			ret=0;
		}
		return ret;
	}
	
	public static Long[] getLongs(String[] str){
		
		if(str==null||str.length<1)
			return new Long[]{0L};
		Long[] ret=new Long[str.length];
		for(int i=0;i<str.length;i++){
			ret[i]=getLong(str[i]);
		}
		return ret;
	}
	
	public static int getInt(String str){
		if(str==null||str.equals(""))
			return 0;
		int ret=0;
		try {
			ret=Integer.parseInt(str);
		} catch (NumberFormatException e) {
			ret=0;
		}
		return ret;
	}
	
	public static int compare(double x,double y){
		BigDecimal val1=new BigDecimal(x);
		BigDecimal val2=new BigDecimal(y);
		return val1.compareTo(val2);
	}
	
	/**
	 * @param d
	 * @param len
	 * @return
	 */
	public static double ceil(double d,int len){
		DecimalFormat formater = new DecimalFormat();
        formater.setMaximumFractionDigits(len);
        formater.setGroupingSize(0);
        formater.setRoundingMode(RoundingMode.FLOOR);
        String str = formater.format(d);
        if(str.indexOf(".")==-1){
        	str+=".";
        }
    	int strLenth = str.substring(str.indexOf(".")+1).length();
        if (strLenth < len) {
			for (int i = strLenth; i < len ; i++)
				str += "0";
		}
		return Double.parseDouble(str);
	}
	
	public static double ceil(double d){
		return ceil(d,2);
	}
	
	/**
	 * 转换成百分比
	 * @param scales
	 * @return
	 */
	public static double toPercent(Double scales) {
		
		double resc = MoneyUtils.multiplication(ceil(scales, 3), 100);
		
		return resc;
	}
	
	/**
	 * 显示成百分比
	 * @Title: percent 
	 * @Description: TODO
	 * @param @param scales
	 * @param @return 设定文件 
	 * @return String 返回类型 
	 * @throws
	 */
	public static String percent(Double scales){
	    
	    String resc = String.valueOf(MoneyUtils.multiplication(ceil(scales, 2), 100));
	    
	    resc = resc.substring(0,resc.indexOf("."));
	    
	    return resc;
	    
	}
	
	public static boolean isRange(int selfnum , int start, int end)
	{
		boolean isRange  = false;
		if (selfnum >= start && selfnum <= end)
			isRange = true;
		
		return isRange;
	}
	
	/***
	 * 效验字符串是否是正整数,是返回true,不是返回false
	 * @param num
	 * @return
	 */
	public static boolean isNumber(String num){
		String eL = "^\\d*[1-9]\\d*$";//整数  
        Pattern p = Pattern.compile(eL);  
        Matcher m = p.matcher(num);  
        return m.matches(); 
	}
	public static void main(String[] args) {
//	    
//	    double aaa = 0;
//	    aaa = 50.000000-ceil(22.55533442244, 2);
//	    System.out.print(aaa);
		
		System.out.println(percent(220522.73/210705.46));
	}
}
