<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Grocery Form Attributes</title>
</head>
<body>
  <h1>Grocery Form Attributes</h1>
  <p>Name: ${groceryForm.name}</p>
  <p>Email: ${groceryForm.email}</p>
  <p>Quantity: ${groceryForm.quantity}</p>
  <p>Category: ${groceryForm.category}</p>
  <p>Category Options:</p>
  <ul>
    <c:forEach var="option" items="${groceryForm.categoryOptions}">
      <li>${option}</li>
    </c:forEach>
  </ul>
  <p>Selected Category: ${groceryForm.selectedCategory}</p>
  <p>Abweichende Monate: ${groceryForm.abweichendeMonate}</p>
  <p>Garantie Option: ${groceryForm.garantieOption}</p>
</body>
</html>
