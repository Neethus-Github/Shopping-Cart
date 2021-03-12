<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Book</title>
<script type="text/javascript">
function validation()
{
	if(document.order_form.cust_name.value=="")
		{
			alert("Please enter your name");
			return false;
		}
	if(document.order_form.address.value=="")
	{
		alert("Please enter your Address");
		return false;
	}
	if(document.order_form.phone_no.value.length!=10)
	{
		alert("Please enter valid Phone number with 10 digits");
		return false;
	}
	
}
</script>
</head>
<body><h2>Shopping Cart for Book Store</h2>
<br>
<c:url var="orderDetails" value="/book/saveOrder">
<c:param name="bookId" value="${book.book_id}"></c:param>
</c:url>
<form:form action="${orderDetails }" method="POST" modelAttribute="order" onsubmit="return validation()" name="order_form">
<form:hidden path="quantity" value="${order.quantity}"/>
<table border="1" width="80%">
<tbody>
<tr>
<td><label>Customer Name:</label></td>
<td><form:input path="cust_name"/></td>
</tr>

<tr>
<td><label>Address:</label></td>
<td><form:input path="address"/></td>
</tr>

<tr>
<td><label>Phone number:</label></td>
<td><form:input path="phone_no"/></td>
</tr>

<tr><td>Book Name</td><td>${book.book_name}</td></tr>
<tr><td>Author</td><td>${book.author}</td></tr>
<tr><td>Price</td><td>Rs.${book.price}</td></tr>
<tr><td>Quantity</td><td>${order.quantity}</td></tr>
<c:set var="value" scope="session" value="${book.price*order.quantity}"/>
<tr><td>Price you need to pay for ${order.quantity} books</td><td>Rs.${value}</td></tr>


<tr>
<td><input type="submit" value="Confirm"></td>
<td><input type="reset" value="Cancel"></td>
</tr>

</tbody>

</table>
</form:form>


</body>
</html>