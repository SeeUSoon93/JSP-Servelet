package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smhrd.model.ModelVO;

public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// menu, price
		ArrayList<ModelVO> list = new ArrayList<ModelVO>();
		list.add(new ModelVO("김군순",200000));
		list.add(new ModelVO("순이티콘",3000));
		list.add(new ModelVO("순이싸인",50000));
		list.add(new ModelVO("소주",4000));

		// Java Object -> JSON 문자열로 변환
		Gson gson = new Gson();
		
		// [{"menu" : "김군순", "price" : "200000"},...]
		String jsonList = gson.toJson(list);
		
		// 응답할 때 한글 데이터가 깨지지않도록 인코딩
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsonList);
		
	
	}

}
