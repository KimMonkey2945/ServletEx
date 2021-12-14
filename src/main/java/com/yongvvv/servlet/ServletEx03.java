package com.yongvvv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/ex03")
public class ServletEx03 extends HttpServlet{
	
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out =response.getWriter();
		
		// 이름, 나이  만드는 사람이 갑이고 정한대로 해야함....
		
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		
		int age = Integer.parseInt(ageString);
		age++;
		
//		out.println("<html><head><title>get파라미터</title></head>");
//		out.println("<body><h2>이름 : " + name + "</h2> <h2>나이 :" + age + "</h2></body></html>");
		//?name= & age=
		
//		{"name":"김인규", "age":29}
		out.println("{\"name\":\"" + name + "\", \"age\":" + age + "}");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
