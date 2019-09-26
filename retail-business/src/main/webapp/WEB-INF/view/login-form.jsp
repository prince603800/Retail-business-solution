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
	
	<div class="container-fluid container-class" >
            <div class = "row" style = "justify-content: center;"> 
            <div class = "col-sm-12 col-md-4 form-div">   
            <h2>Login As  Customer</h2>
                <form:form action="cu-login" method = "post" modelAttribute = "customerInfo" id="second_form">               
                   <div class="form-group">
                         <form:input type="email" class="form-control" id="user_email" placeholder="Enter email" path="user_email"/>
                    </div>
                   
                  <div class="form-group">
                    <form:input type="password" class="form-control" id="psword1" placeholder="Enter password" path="psword1"/>
                  </div>       
                  <button type="submit" class="btn1">Submit</button>
                </form:form>
            </div>
            <div class = "col-sm-12 col-md-4 form-div">   
                <h2>Login As Retailer</h2>
                    <form:form action="${pageContext.request.contextPath}/retailerController/re-login" method = "post" modelAttribute = "retailerInfo" id="login-form">               
                       <div class="form-group">
                             <form:input type="email" class="form-control" id="user_email" placeholder="Enter email" path="user_email"/>
                        </div>
                       
                      <div class="form-group">
                        <form:input type="password" class="form-control" id="psword1" placeholder="Enter password" path="psword1"/>
                      </div>       
                      <button type="submit" class="btn1">Submit</button>
                    </form:form>
                </div>
           
            </div>
        </div>
        </body>
        </html>