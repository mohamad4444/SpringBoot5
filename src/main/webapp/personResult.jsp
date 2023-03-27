<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Form Result</title>
</head>
<body>
    <h2>Submitted Information</h2>
    <p>Name: ${person.name}</p>
    <p>Country: ${person.country}</p>
    <a href="/myapp2/person">Back to form</a>
</body>
</html>