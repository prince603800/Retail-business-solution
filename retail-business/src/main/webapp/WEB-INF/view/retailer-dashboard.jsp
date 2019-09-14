<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action = "customerRegistration " modelAttribute = "customerInfo">
		<table>
			<tr><td>Item Name: </td><td><form:input path="cusFname"/></td></tr>
			<tr><td>Type: </td><td><form:input path="cusLname"/></td></tr>
			
				
		</table>
			<form:button>Submit</form:button>
	</form:form>
</body>
</html>