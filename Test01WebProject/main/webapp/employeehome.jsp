<%@page import="entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmployeeHome</title>
</head>
<body>
<% 
	Employee e = (Employee)request.getAttribute("employee");
%>
<h1>Welcome to Home page</h1>
<p>NAME : <%=e.getEmpName() %></p>
<p>EMP ID : <%=e.getEmpId() %></p>
<p>DESG : <%=e.getDesg() %></p>
<p>DEPT : <%=e.getDept() %></p>
<p>MGR ID : <%=e.getMgr() %></p>
<p>HIRE DATE : <%=e.getHireDate() %></p>
<p>SAL : <%=e.getSal() %></p>
<p>COMM : <%=e.getComm() %></p>

</body>
</html>