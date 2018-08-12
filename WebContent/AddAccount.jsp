<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#form{
		position: fixed;
		top: 100px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header><%@include file="header.jsp" %></header>

<article>
	<div id="form">
		<form action="view.app" method="get">
			Name:<input type="text" name="name"/></br>
			Email:<input type="email" name="email"/></br>
			Date Of Birth:<input type="date" name="dob"/></br>
			Phone:<input type="number" name="phone" pattern="[6-9]{10}"/></br>
			Account Type: <select name="acctype">
				<option value="select" >select</option>
				<option value="savings">Savings</option>
				<option value="current">Current</option>
			</select></br>
			
			If Savings:
				Salaried<input type="radio" name="sal" value="salaried">
				Non Salaried<input type="radio" name="sal" value="nonsalaried">
			</br>	
			If Salaried: Enter the account balance:<input type="number" name="salbal"></br>
			If non Salaried: Enter the account balance:<input type="number" name="nonsalbal"></br>
			
			For Current Account Holders:</br> Enter the overDraft Limit<input type="number" name="overdraft"></br>
			Enter the account balance:<input type="number" name="currentbal"></br>
			
			<input type="submit" value="submit">
			<input type="reset" value="reset">
		</form>
	</div>
</article>

<footer><%@include file="footer.jsp" %></footer>
</body>
</html>