<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calci">
VALUE 1 : <input type="text" name="value1"><br/>
VALUE 2 : <input type="text" name="value2"><br/>
<input type="submit" name="optr" value="+">
<input type="submit" name="optr" value="-">
<input type="submit" name="optr" value="*">
<input type="submit" name="optr" value="/">
</form>
${result }
</body>
</html>