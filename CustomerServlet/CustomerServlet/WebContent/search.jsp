<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerController" method="post">
    <table>
    <tr>
    <td>Name:</td>
    <td><input type="text" name="sname"></td>
    <tr>
      <td>
        <input type="submit" value="Search">
      </td>  
    </table>
    <input type="hidden" name="action" value="searching"/>
 </form> 
 <%if(request.getAttribute("msg")!=null)
    	{
    	String message=(String)request.getAttribute("msg");
    	
    	%>
    	<%= message %>
    <%  
  	  }%>
  <a href="home.jsp">click here</a>to got to Home Page<br>
  
</body>
</html>