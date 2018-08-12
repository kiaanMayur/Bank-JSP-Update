<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
    
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
	#top{
	text-align: center;
	position: fixed;
	top: 180px;
	font-family: Bahschrift;
	}
	
	#details{
	position: fixed;
	text-align: center;
	top: 200px;
	}
	
	#back{
	text-align: left;
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
	<div id="top">
		Congratulations your account has been created!!!
	</div>
	
	<div id="details">
	Account Number: ${account.accountNo}</br>
	Name: ${account.customer.name}</br>
	Email: ${account.customer.email}</br>
	Phone: ${account.customer.phone}</br>
	
	<jstl:if test="${param.acctype == 'savings'}">
	<p>Account type: Savings</p></jstl:if>
	
	<jstl:if test="${param.sal == 'salaried'}">
	<p>Savings Account type: Salaried
	Account Balance: ${account.balance}</p></jstl:if>
	
	<jstl:if test="${param.sal == 'nonsalaried'}">
	<p>Savings Account type:Non Salaried
	Account Balance: ${account.balance}</p></jstl:if>
	
	<jstl:if test="${param.acctype == 'current'}">
	Account type: Current</br>
	Overdraft limit: ${account.overdraft }</br>
	Account Balance: ${account.balance}</jstl:if>
	</div>
	
	<div id="back">
	<a href="back.app">Back</a>
	</div>
</article>
<footer><%@include file="footer.jsp" %></footer>
</body>
</html>