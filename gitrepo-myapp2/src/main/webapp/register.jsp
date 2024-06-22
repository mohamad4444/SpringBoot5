<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form:form method="POST" modelAttribute="user">
  <form:errors path="*" cssClass="error" />

  <form:label path="name">Name</form:label>
  <form:input path="name" />
  <form:errors path="name" cssClass="error" />

  <form:label path="email">Email</form:label>
  <form:input path="email" />
  <form:errors path="email" cssClass="error" />

  <form:label path="password">Password</form:label>
  <form:input path="password" />
  <form:errors path="password" cssClass="error" />

  <input type="submit" value="Register" />
</form:form>
