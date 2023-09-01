package com.smhrd.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	// interface : 틀
	
	// 추상메소드 : 틀 안의 항목 _> 이 인터페이스를 상속박으면 무조건 구현
	
	public abstract String execute(HttpServletRequest request, HttpServletResponse response);
	
	
	
	
}
