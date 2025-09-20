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
<h2>Categories</h2>

<form method="get" action="">
    <input type="text" name="keyword" value="${keyword}" placeholder="Search..." />
    <button type="submit">Search</button>
</form>

<a href="add">Add New Category</a>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Description</th><th>Action</th></tr>
    <c:forEach var="c" items="${categories}">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.description}</td>
            <td>
                <a href="edit/${c.id}">Edit</a>
                <a href="delete/${c.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>