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

<h3>Creating Customer </h3>
<fieldset>
<table>
  <tr>
      <td>Name:</td>
      <td><input type="text" name="cname"></td>
  </tr>
  <tr>
      <td>place:</td>
      <td>
      <select name="city">
       <option value="--select">--select--</option>
       <option value="Hyd">Hyderabad</option>
       <option value="Bng">Banglore</option>
       <option value="Chen">Chennai</option>
       <option value="Tvm">Trivandrum</option>
       </select>
      </td>
  </tr>
</table>
</fieldset>
<input type="submit" value="SUBMIT"/>

 <%if(request.getAttribute("msg")!=null)
    	{
    	  message=(String)request.getAttribute("msg");
    	
    	%>
    	<%= message %>
    <%
  	  }%>
  	  <input type="hidden" name="action" value="create">
<br><a href="home.jsp">Click here</a>to go to Home Page
  </form>
</body>
</html>