<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
</head>
<body>
    <h2>Edit Employee</h2>
    <form action="<c:url value='/edit'/>" method="post">
        <input type="hidden" name="empNo" value="${employee.empNo}">
        <label for="eName">Name:</label>
        <input type="text" id="eName" name="eName" value="${employee.eName}">
        <br><br>
        <label for="job">Job:</label>
        <input type="text" id="job" name="job" value="${employee.job}">
        <br><br>
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary" value="${employee.salary}">
        <br><br>
        <label for="deptNo">Department No:</label>
        <input type="text" id="deptNo" name="deptNo" value="${employee.deptNo}">
        <br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
