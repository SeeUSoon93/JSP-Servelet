package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.command.Command;
import com.smhrd.model.MemberDAO;

public class DeleteService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");

		System.out.println(email);
		int del = new MemberDAO().deleteMember(email);

		if (del != 0) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패...");
		}
	
		return "ShowMember.jsp";
	}

}
