<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
<script type="text/javascript">
function validation()
{
	if(document.contact_form.username.value=="")
		{
			alert("Please enter your username");
			return false;
		}
	if(document.contact_form.password.value.length<6 )
	{
		alert("Please enter your password!Password should be of minimum 6 characters");
		return false;
	}
	if((document.contact_form.gender[0].checked==false)&&(document.contact_form.gender[1].checked==false))
		{
			alert("Please select your gender");
			return false;
		}
	if(document.contact_form.country.selectedIndex==0)
		{
			alert("Please select your Country");
			return false;
		}
	if(document.contact_form.terms.checked == false)
		{
			alert("Please agree the terms");
			return false;
		}
	if(document.contact_form.phone.value.length!=10)
	{
		alert("Phone number should be 10 digit");
		return false;
	}
	if(document.contact_form.city.value.length<2)
	{
		alert("Enter email id with minimum 2 characters long");
		return false;
	}
	if(document.contact_form.email.value.length<6)
	{
		alert("Enter email id with minimum 6 characters long");
		return false;
	}
	if(document.contact_form.addressone.value.length<6)
	{
		alert("Enter address line 1 with minimum 6 characters long");
		return false;
	}
	if(document.contact_form.addresstwo.value.length<6)
	{
		alert("Enter address line 2 with minimum 6 characters long");
		return false;
	}
	if(document.contact_form.pincode.value.length<6)
	{
		alert("Enter Pincode with minimum 6 characters long");
		return false;
	}
}
</script>
</head>
<body>
<h2>User Data</h2>
<br>

<form:form action="saveUser" method="POST" modelAttribute="user" onsubmit="return validation()" name="contact_form">
<form:hidden path="id"/>
<table>
<tbody>


<tr>
<td><label>Username:</label></td>
<td><form:input path="username"/></td>
</tr>

<tr>
<td><label>Mobile Number:</label></td>
<td><form:input path="phone"/></td>
</tr>

<tr>
<td><label>Password:</label></td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td><label>Gender:</label></td>
<td><label>Male:</label><form:radiobutton path="gender" value="male"/></td>
<td><label>Female:</label><form:radiobutton path="gender" value="female"/></td>
</tr>

<tr>
<td><label>Address Line 1:</label></td>
<td><form:input path="addressone"/></td>
</tr>

<tr>
<td><label>Address Line 2:</label></td>
<td><form:input path="addresstwo"/></td>
</tr>
<tr>
<td><label>Email:</label></td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td><label>Country:</label></td><td><form:select path="country">
<form:option value="select" selected="selected" label="select"/>
<form:option value="India" label="India"/>
<form:option value="US" label="US"/>
<form:option value="UK" label="UK"/>
<form:option value="Italy" label="Italy"/>
<form:option value="Canada" label="Canada"/>
</form:select></td>
</tr>

<tr>
<td><label>City:</label></td>
<td><form:input path="city"/></td>
</tr>
<tr>
<td><label>Pincode:</label></td>
<td><form:input path="pincode"/></td>
</tr>

<tr>
<td><label>I do agree terms and conditions</label></td>
<td><form:checkbox path="terms" value="yes"/></td>
</tr>



<tr>
<td><label></label></td>
<td><input type="submit" value="Save"></td>
</tr>


</tbody>

</table>
</form:form>


</body>
</html>