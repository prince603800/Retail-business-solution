
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<jsp:include page="common/head.jsp"></jsp:include>
<link type = "text/css" rel = "stylesheet" href = "${pageContext.request.contextPath}/static/css/formvalidation.css">
<body class = "main-body">
	<jsp:include page="common/header.jsp"></jsp:include>
	
		
	<%-- <form:form action = "customerRegistration " modelAttribute = "customerInfo">
		<table>
			<tr><td>FirstName: </td><td><form:input path="cusFname"/></td></tr>
			<tr><td>LastName: </td><td><form:input path="cusLname"/></td></tr>
			<tr><td>Pan No: </td><td><form:input path="panNo"/></td></tr>
			<tr><td>Phone No: </td><td><form:input path="phoneNo"/></td></tr>
			<tr><td>Address: </td><td><form:input path="address"/></td></tr>
				
		</table>
			<form:button>Submit</form:button>
	</form:form> --%>
	
	<div class="container">
            <div class = "custom-row"> 
            <div class = "col-sm-12 col-md-6">   
            <h2>Retailer Registration Form</h2>
                <form:form action="retailer-registration" method = "post" modelAttribute = "retailerInfo" id="second_form">
                  <div class="form-group">
                   <form:input type="text" class="form-control" id="fname" placeholder="Enter First Name" path="fname"/>
                  </div>
                  <div class="form-group">
                        <form:input type="text" class="form-control" id="lname" placeholder="Enter Last Name" path="lname"/>
                   </div>
                   <div class="form-group">
                         <form:input type="email" class="form-control" id="user_email" placeholder="Enter email" path="user_email"/>
                    </div>
                   <div class="form-group">
                        <form:input type="number" class="form-control" id="panNo" placeholder="Enter Shop Registration No" path="vatNo"/>
                    </div>
                    <div class="form-group">
                        <form:input type="text" class="form-control" id="address" placeholder="Enter Address" path="address"/>
                    </div>
                    <div class="form-group">
                        <form:input type="number" class="form-control" id="phoneNo" placeholder="Enter your phone no" path="phoneNo"/>
                    </div>
                  <div class="form-group">
                    <form:input type="password" class="form-control" id="psword1" placeholder="Enter password" path="psword1"/>
                  </div>
                  
                  <div class="form-group">
                        
                        <form:input type="password" class="form-control" id="psword2" placeholder="Re-enter password" path="psword2"/>
                      </div>
                  
                  <button type="submit" class="btn1">Submit</button>
                </form:form>
            </div>
            </div>
        </div>
	
</body>
</html>