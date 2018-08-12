<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#with{
	position: fixed;
	top: 150px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header><%@include file="header.jsp" %></header>

<article>
	<div id="with">
		<form action="withdraw.app" method="get">
		Enter the account number: <input type="number" name="accno"></br>
		Enter the money to withdraw from the account<input type="number" name="money">
		<input type="submit" value="withdraw">
		</form>
		
	</div>
</article>

<footer><%@include file="footer.jsp" %></footer>
</body>
</html>