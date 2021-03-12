<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation()
{
	if(document.purchase_form.quantity.value=="" || document.purchase_form.quantity.value<1)
		{
			alert("Please enter quantity");
			return false;
		}
}
</script>
</head>
<body>
<h2>Shopping Cart for Book Store</h2>
<c:url var="purchase" value="/book/purchaseDetails">
<c:param name="bookId" value="${book.book_id}"></c:param>
</c:url>
<form:form action="${purchase }" method="POST" modelAttribute="order" onsubmit="return validation()" name="purchase_form">
<form:hidden path="order_id"/>


<table border="1" width="80%">	
<tbody>

<tr><td>Book Name</td><td>${book.book_name}</td></tr>
<tr><td>Author</td><td>${book.author}</td></tr>
<tr><td>Price</td><td>${book.price}</td></tr>

<tr><td><label>Please Enter Quantity:</label></td><td><form:input path="quantity"/></td></tr>
<tr>
<td><input type="submit" value="Purchase"></td>
<td><input type="reset" value="Cancel"></td>
</tr>
</tbody>
</table>

</form:form>
<br>
<input type="button" value="Back" 
onclick="window.location.href='list';  return false;" />
</body>
</html>