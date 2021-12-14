package com.yongvvv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//앞으로는 이렇게 사용하면됨....
@WebServlet("/servlet/ex02")
public class ServletEx02 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// html을 통해서 1~ 10까지의 합을 전달
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 1~10까지의 합
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		
		out.println("<html><head><title>합계</title></head>");
		out.println("<body> 합계 : <strong>" + sum + "</strong> </body></html>");
	}
	
}
