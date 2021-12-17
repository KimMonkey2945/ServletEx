<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

	Calendar today = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
	String formatString = formatter.format(today.getTime());
%>

	<%= formatString %>


	
	<% 
	
		Calendar calendar = Calendar.getInstance();
		
		//날자계산
		
		// calendar.add(Calendar.DATE, 20);
		// calendar.add(Calendar.MONTH, 5);
		// calendar.add(Calendar.YEAR, 10);
		 
		
			
	%>
	
	<br>
		<h2><%=formatter.format(calendar.getTime()) %></h2>
	
	<br>
	<%-- 날짜비교 --%>
	
	<%
		//앞의것이 뒤의 것  보다 크다 : 양수(1)
		//앞의 것이 뒤의 것보다 작다	: 음수(-1)
		// 같다 : 0
		//ex 10 - 5 양수, 5 - 10 음수
		int result = today.compareTo(calendar);
	
	
		if(result > 0){
			out.println("today가 더 크다");
		}else if(result < 0){
			out.println("today가 더 작다");			
		}else{
			out.println("같다");						
		}
	
	
	%>
	












</body>
</html>