<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grocery Items</title>
</head>
<body>
	<h1>Grocery Items</h1>
	<form:form action="GroceryItems.do" modelAttribute="GroceryForm"
		method="post">
		<label>Name:</label>
		<form:input path="name" />
		<br>
		<br>
		<label>Quantity:</label>
		<form:input path="quantity" />
		<br>
		<br>
		<input type="submit" name="action" value="submitForm" />
		<br>
		<label for="category">Category:</label>
		<br>
		<c:forEach items="${GroceryForm.getCategoryOptions()}" var="category">
			<form:radiobutton path="selectedCategory"
					value="${category}" /> ${category}
			<label>
			</label>
			<br>
		</c:forEach>
		<br>
	</form:form>
	<c:if test="${GroceryForm.selectedCategory == 'member'}">
		<p>Welcome, Member user!</p>
		<a href="/member">Member panel</a>
	</c:if>

</body>
</html>
