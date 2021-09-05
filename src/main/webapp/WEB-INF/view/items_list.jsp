<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo Lists</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
  <h2>Todo Items</h2>

          <table class="table">
            <thead>
              <tr>
                <th>Title</th>
                <th>Deadline</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="item" items="${todoData.items}">
                 <tr>
                    <td><c:out value="${item.title}" /></td>
                    <td><c:out value="${item.details}" /></td>
                 </tr>
              </c:forEach>
            </tbody>
          </table>
</div>
</body>
</html>>