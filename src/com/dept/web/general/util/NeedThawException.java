package com.dept.web.general.util;

@SuppressWarnings("all")
public  class NeedThawException  extends RuntimeException{
	
	public NeedThawException() {
	}
	public NeedThawException(String message){
		super(message);
	}
	
}
