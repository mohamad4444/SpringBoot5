<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Person Form</title>
</head>
<body>
    <form:form method="POST" modelAttribute="person">
        <label>Name:</label>
        <form:input path="name" />
        <br>
        <label>Country:</label>
        <form:select path="country">
            <form:option value="" label="Select a country" />
            <form:options items="${countries}" />
        </form:select>
        <br>
        <button type="submit">Submit</button>
    </form:form>
</body>
</html>
