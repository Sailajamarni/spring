<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
    <h2>Add Employee</h2>
    <form action="<c:url value='/add'/>" method="post">
        <label for="empNo">Employee No:</label>
        <input type="text" id="empNo" name="empNo">
        <br><br>
        <label for="eName">Name:</label>
        <input type="text" id="eName" name="eName">
        <br><br>
        <label for="job">Job:</label>
        <input type="text" id="job" name="job">
        <br><br>
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary">
        <br><br>
        <label for="deptNo">Department No:</label>
        <input type="text" id="deptNo" name="deptNo">
        <br><br>
        <input type="submit" value="Add">
    </form>
</body>
</html>
