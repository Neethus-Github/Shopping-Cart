<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><h2>Shopping Cart for Book Store</h2>
<table border="1" width="80%">
<tr>
<th>Book Name</th>
<th>Author</th>
<th>Price</th>

</tr>
<c:forEach var="tempBook" items="${books}">
<c:url var="bookLink" value="/book/showFormForPurchase">
				<c:param name="bookId" value="${tempBook.book_id}"></c:param>
			</c:url>

<tr>
<td><a href="${bookLink}">${tempBook.book_name}</td>
<td>${tempBook.author}</td>
<td>${tempBook.price}</td>
</tr>
</c:forEach>
</table>
<br>
<input type="button" value="Back" 
onclick="window.location.href='list';  return false;" />
</body>
</html>