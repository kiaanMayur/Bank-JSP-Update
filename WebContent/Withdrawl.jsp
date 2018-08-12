<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<article>
	<jstl:if test="test == 0"></jstl:if>
	Sorry account number not found.
	<jstl:if test="test != 0"></jstl:if>
	the account, with account number ${param.accno} has be debitted with Rs ${param.money}
	remaining balance: ${test}
</article>

</body>
</html>