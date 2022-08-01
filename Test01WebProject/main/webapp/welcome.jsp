<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Scripting Element Tag, ScriptLet Tag demo</h1>
<%
	String str1 = "Hello";			//Local Declaration in _jspService()
	System.out.println("str : " + str1);
%>

str1 = <%= str1 %>

<%!
	String str2 = "SUGNANA";			//Global Declaration
	public String testMethod(){
		//System.out.println("String str : " + str);
		return "String str : " + str2;
	}
%>
<br/>testMethod() = <%=	testMethod()%>
<br/>this.str1 = <%= str1 %>
</body>
</html>