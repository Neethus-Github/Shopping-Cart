<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<script type="text/javascript">
function validation()
{
	if(document.login_form.username.value=="")
		{
			alert("Please enter your username");
			return false;
		}
	if(document.login_form.password.value=="")
	{
		alert("Please enter your password");
		return false;
	}
}
</script>
</head>
<body>
<h2>Please Login!!</h2>
<br>

<form action="loginUser" method="get" onsubmit="return validation()" name="login_form">
<table>
<tr><td>UserId(Mobile Number)</td><td><input type="text" name="username"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="Sign in"></td></tr>
</table>

</form>

</body>
</html>