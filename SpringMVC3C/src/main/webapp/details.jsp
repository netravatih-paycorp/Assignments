<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
</head>
<body>
    <h1>Student Details</h1>
    <table border="2">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Branch</th>
            <th>Date of Birth</th>
            <th>Delete<th>
            <th>Update<th>
        </tr>
        <c:forEach var="student" items="${data}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.gender}</td>
                <td>${student.branch}</td>
                <td>${student.DOB}</td>
                <td><a href="delete?id=${student.id}">Delete</a><td>
                <td><a href="update?id=${student.id}">EDIT</a><td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>