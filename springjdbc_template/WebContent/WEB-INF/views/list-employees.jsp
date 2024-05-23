<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Employees</title>
</head>
<body>
    <h2>List of Employees</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Employee No</th>
                <th>Name</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Department No</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.empNo}</td>
                    <td>${employee.eName}</td>
                    <td>${employee.job}</td>
                    <td>${employee.salary}</td>
                    <td>${employee.deptNo}</td>
                    <td>
                        <a href="<c:url value='/edit/${employee.empNo}'/>">Edit</a>
                        <a href="<c:url value='/delete/${employee.empNo}'/>">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<c:url value='/add'/>">Add New Employee</a>
</body>
</html>
