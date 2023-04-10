<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grocery Items</title>
</head>
<body>
  <h1>Grocery Items</h1>
<form:form action="GroceryItems.do" modelAttribute="groceryForm" method="post" enctype="multipart/form-data">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name">
    <br>
    <label for="file">File:</label>
    <input type="file" name="file" id="file">
    <br>
    <input type="submit" name="action" value="submitForm">
  </form:form>




</body>
</html>
