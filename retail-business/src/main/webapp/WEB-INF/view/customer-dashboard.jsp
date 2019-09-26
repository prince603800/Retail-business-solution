<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<jsp:include page="common/head.jsp"></jsp:include>
<link type = "text/css" rel = "stylesheet" href = "${pageContext.request.contextPath}/static/css/formvalidation.css">
<body class = "main-body container-class">
	<jsp:include page="common/header.jsp"></jsp:include>
	<p>Hello  ${validcustomer.fname}  to  Customer dashboard!!!</p>
	 
	 <h3>Please select one retailer!!!</h3>
	 
	 
	
	 <div class = "container">
            <div class = "row">
             	<c:forEach items = "${retailersInfo}" var = "listRetailers">
               <c:url var = "selectRetailer" value = "/customerController/customerdashboard-retailerdetail">
               		<c:param name = "retailerId" value = "${listRetailers.retailerId}"></c:param>
               		<c:param name = "customerId" value = "${validcustomer.customerId}"></c:param>
               </c:url>
                <div class = "col-sm-4">
                    <div class = "retailer-card">
                        <p class = "rl-n">RetailerName: <span>${listRetailers.fname}  ${listRetailers.lname}</span></p>
                        <p class = "rl-p">Address: <span>${listRetailers.address}</span> </p>
                        <p class = "rl-p">Vat No: <span>${listRetailers.vatNo}</span></p>
                        <p class = "rl-p">Phone No: <span>${listRetailers.phoneNo}</span></p>
                        <a class = "rl-btn" href = "${selectRetailer}">Select Retailer</a>
                    </div>
                </div>
                </c:forEach>
               </div>
          </div>	
</body>
</html>