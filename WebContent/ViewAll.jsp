<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#view{
	position: fixed;
	top: 130px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header><%@include file="header.jsp" %></header>
<article>
	<div id="view">
		 <jstl:forEach items="${account}" var="acc">
		 Name: ${acc.customer.name} </br>
		 Email: ${acc.customer.email } </br>
		 Date of Birth: ${acc.customer.dob}</br>
		 Phone: ${acc.customer.phone }</br>
		 
		 <jstl:if test="${param.acctype == 'savings'}">
	<p>Account type: Savings</p></jstl:if>
	
	<jstl:if test="${param.sal == 'salaried'}">
	<p>Savings Account type: Salaried</p></jstl:if>
	
	<jstl:if test="${param.sal == 'nonsalaried'}">
	<p>Savings Account type:Non Salaried</p></jstl:if>
	
	<jstl:if test="${param.acctype == 'current'}">
	Account type: Current</br>
	Overdraft limit: ${account.overdraft }</br>
	Account Balance: ${account.balance}</jstl:if>
	
		 </jstl:forEach>
	</div>
</article>
<footer<%@include file="footer.jsp" %>></footer>
</body>
</html>