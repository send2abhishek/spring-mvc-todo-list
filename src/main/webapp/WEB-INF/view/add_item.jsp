<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
    <%@ page import="org.springmvc.tutorial.utils.AttributesNames" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
    <form:form method="post" modelAttribute="${AttributesNames.TODO_ITEM}">
   <table>
                       <tr>
                           <td><label>ID</label></td>
                           <td>
                               <form:input path="id" disabled="true" />
                           </td>
                       </tr>
                       <tr>
                           <td><label>Title</label></td>
                           <td><form:input path="title"/></td>
                       </tr>
                       <tr>
                           <td><label>Deadline</label></td>
                           <td><form:input path="deadLine"/></td>
                       </tr>
                       <tr>
                           <td><label>Details</label></td>
                           <td><form:textarea path="details"/></td>
                       </tr>
                       <tr>
                           <td><input type="submit" value="Submit"/></td>
                       </tr>
                   </table>

    </form:form>
</div>
</body>
</html>>