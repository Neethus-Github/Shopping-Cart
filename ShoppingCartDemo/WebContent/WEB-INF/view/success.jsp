<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>
<h2>Login Successful!!</h2>
<br>


<input type="button" value="Purchase Book" 
onclick="window.location.href='list';  return false;" />
<br><br>

<table border="1" width="80%">
<tr>
<th>Username</th>
<th>Mobile Number</th>
<th>Password</th>
<th>Gender</th>
<th>Address Line 1</th>
<th>Address Line 2</th>
<th>Email</th>
<th>Country</th>
<th>City</th>
</tr>
<c:forEach var="tempUser" items="${user}">
<c:url var="updateLink" value="/book/showFormForUpdate">
				<c:param name="userId" value="${tempUser.id}"></c:param>
			</c:url>
			<c:url var="deleteLink" value="/book/delete">
				<c:param name="userId" value="${tempUser.id}"></c:param>
			</c:url>

<tr>
<td>${tempUser.username}</td>
<td>${tempUser.phone}</td>
<td>${tempUser.password}</td>
<td>${tempUser.gender}</td>
<td>${tempUser.addressone}</td>
<td>${tempUser.addresstwo}</td>
<td>${tempUser.email}</td>
<td>${tempUser.country}</td>
<td>${tempUser.city}</td>
<td><a href="${updateLink}">Update</a></td>
<td><a href="${deleteLink}">Delete</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>