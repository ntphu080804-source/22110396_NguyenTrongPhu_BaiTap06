<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<head><title>Category Form</title></head>
<body>
<h2>Category Form</h2>
<form method="post" action="save">
    <input type="hidden" name="id" value="${category.id}" />
    Name: <input type="text" name="name" value="${category.name}" required /><br/>
    Description: <input type="text" name="description" value="${category.description}" /><br/>
    <button type="submit">Save</button>
</form>
<a href="../categories">Back</a>
</body>
</html>