<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
	
	#select{
		text-align: center;
		position: fixed;
		top: 120px;
		font-size: 30px;
		font-family: Gill Sans MT;
	}
	
	#option{
		position: fixed;
		top: 170px;
		font-size: 25px;
		font-family: Berlin Sans FB;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header><%@include file="header.jsp" %></header>

<article>	
	<div id="select">
		Select your option:
	</div>
	
	<div id="option">
		<a href="add.app">Add Account</a></br></br>
		<a href="displayall.app">View All Account</a></br></br>
		<a href="search.app">Search by account Number</a></br></br>
		<a href="with.app">Withdraw Amount</a></br></br>
		<a href="deposit.app">Deposit Amount</a></br></br>
		<a href="fund.app">Fund Transfer</a></br></br>
	</div>
</article>

<footer><%@include file="footer.jsp" %></footer>
</body>
</html>