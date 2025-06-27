<%@ page import = "java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	 <!-- Java Code + html code  inside Jsp  -->
	<% LocalDate date = LocalDate.now(); %>                

	<h5>Date: <%= date %> </h5>
	<h2>Login Successful</h2>
	<h3> Welcome ${ dbUname } </h3>

</body>
</html>