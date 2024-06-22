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
    <label>Name:</label>
    <form:input path="name" />
    <br>
    <br>
    <label>Quantity:</label>
    <form:input path="quantity" />
    <br>
    <label for="category">Category:</label>
    <br>
    <c:forEach items="${groceryForm.getCategoryOptions()}" var="category">
      <form:radiobutton path="selectedCategory" value="${category}" /> ${category}
			<label> </label>
      <br>
    </c:forEach>
  
    <c:if test="${groceryForm.selectedCategory == 'member'}">
      <br>
      <p>Welcome, Member user!</p>
      <a href="/member">Member panel</a>
      <br>
    </c:if>

    <form:radiobutton path="garantieOption" value="Gesetzlich" label="Gesetzliche Gewährleistung" />
    <br>
    <form:radiobutton path="garantieOption" value="Abweichend" label="Abweichende Gewährleistung/Garantie: min." />
    <input type="number" name="abweichendeMonate" value=0 min="0" max="12" step="1" />
    <label>Monate</label>
      <br>
    <input type="file" name="file" id="file">
    <!-- Submit Files-->
    <br>
    <form:textarea path="textArea" rows="3" cols="30" value="${textArea}" />


    <input type="submit" name="action" value="submitForm" />
    <br>
    hi
  </form:form>



</body>
</html>
