
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

	<!-- html 주석 -->
	<%--jsp 주석: 페이지 소스보기에는 안보여짐, 서버에서 처리되고 사라진다.
	jsp는 자바 서버에서 끝이난다 자바스크립트와는 전혀 관계 없다..
	--%>
	
	<%
		//자바를 위한 공간 
		//1~10까지의 합
		
		int sum=0;
	for	(int i = 1; i<=10; i++){
		sum += i;
	}
	%>
	<Strong>합계 : <%=sum%></Strong>
	
	
	<%
	
	//임포트는 수동으로 넣어야함..
	List<String> animals = new ArrayList<>();
	animals.add("dog");
	animals.add("cat");
	
	%>
	
	
	<b><%=animals.get(0) %></b>	
	<b><%=animals.get(1) %></b>	
	
	
	<%--선언(멤버변수, 메소드선언) --%>
	<%!
	
	private int number = 10;
	
	//Hello World 라는 문자열 리턴하는 메소드
	public String getHelloWorld(){
		return "hello world";
	}
	
	%>

	<br>
	<%= number + 20 %>
	<br>
	
	<%=getHelloWorld() %>
	
	
</body>
</html>