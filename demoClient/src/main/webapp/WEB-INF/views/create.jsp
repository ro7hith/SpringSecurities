<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CreateUser">
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><input type="radio" name="roles" value="admin">Admin<input
					type="radio" name="roles" value="user">User</td>
			</tr>
		</table>
		<input type="submit">
		<c:if test="${S!=null}">
		${S}
		</c:if>
	</form>
</body>
</html>