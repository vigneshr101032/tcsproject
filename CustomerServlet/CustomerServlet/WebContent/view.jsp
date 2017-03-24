<%@page import="com.customer.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
p{color:"yellow"}
}
</style>
</head>
<body>
<% Customer cust = (Customer) request.getAttribute("customer"); 
if(cust.getName()!=null){%>
<fieldset>
<table>
<tr>
    <td color="yellow">Name</td>
    <td color="red">Place</td>
</tr>
<tr>
     <td><%= cust.getName() %></td>
     <td><%= cust.getPlace() %></td>
</tr>
</table>
</fieldset>
<% } %>
<a href="home.jsp">   click here</a>to HOME page
</body>
</html>