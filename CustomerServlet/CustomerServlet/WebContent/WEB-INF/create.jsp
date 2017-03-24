<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
   <table>
     <caption> Add Customer</caption>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
         </tr>
         <tr>
             <td>Age:</td>
             <td><<input type="text" name="age"></td>
           </tr>
           <tr>
            <td>Country:</td>
            <td><select name="country" id="odc">
                 <option value="--select--">--select--</option>
                 <option value="Ind">india</option>
                 <option value="Aus">Australia</option>
                 <option value="swe">swedan</option></select>
             </td>    
         </tr>
         <tr>
            <td>Address:</td>
            <td><textarea name="address" id="address"></textarea></td>
         </tr>
         <tr>
            <td>Gender:</td>
            <td><input type="radio" name="gender" value="M">male</td>
             <td><input type="radio" name="gender" value="F">female</td>            
         </tr> 
         <tr>
            <td>Maritial Status:</td>
            <td><select name="maried Status" id="mst">
                 <option value="--select--">--select--</option>
                 <option value="Sing">single</option>
                 <option value="mari">Maried</option>
                 <option value="devr">Divorced</option></select>
             </td>    
         </tr>
      </table>
      <input type="submit" value="SUBMIT">
</fieldset>
</body>
</html>