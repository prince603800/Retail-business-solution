<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<nav class="navbar navbar-expand-md  navbar-dark">
        <a class="navbar-brand" href="#">Order Us</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
          <ul class="navbar-nav ml-auto mrg-r">
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/customerController/cr-page">Customer Registration</a>
            </li>
            <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/retailerController/re-page">Retailer Registration</a>
                  </li>
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/customerController/login-form">Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Link</a>
            </li>    
          </ul>
        </div>  
   </nav>