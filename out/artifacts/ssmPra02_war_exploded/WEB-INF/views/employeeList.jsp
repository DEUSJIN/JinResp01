<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/15
  Time: 8:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<h1 align="center">All Employees</h1>
<table align="center" border="1px" cellspacing="0px" width="70%">
    <tr>
        <th>Id</th>
        <th>Last_name</th>
        <th>Email</th>
        <th>Gender</th>
        <th>DeptId</th>
        <th>DeptName</th>
        <th>Option</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr align="center">
            <td>${employee.id}</td>
            <td>${employee.lastName}</td>
            <td>${employee.email}</td>
            <td>${employee.gender}</td>
            <td>${employee.department.id}</td>
            <td>${employee.department.name}</td>
            <td>
                <a href="#" Edit></a>
                <a href="#" Delete></a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2 align="center"><a href="#">Add Employee</a> </h2>
</body>
</html>
