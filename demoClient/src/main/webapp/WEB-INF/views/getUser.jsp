<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getusers">
<input type="submit">
<c:if test="${logins!=null }">
<table>
<tr><th>id</th><th>EAMIL</th><th>PASSWORD</th><th>ROLE</th></tr>
<c:forEach var="l" items="${logins}">
<tr><th>${l.id}</th><th>${l.email}</th><th>${l.password}</th><th>${l.roles}</th></tr>

</c:forEach>
</table>
</c:if>
</form>
</body>
</html>