<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/13
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>emps</title>
</head>
<body>
<table align="center" border="1px" cellspacing="0px" width="70%">
    <tr align="center">
        <th>Id</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Gender</th>
        <th>DeptName</th>
        <th>Operation</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr align="center">
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.gender==1?"男":"女"}</td>
            <td>${emp.department.name}</td>
            <td>
                <a href="#" >Delete</a>
                <a href="#" >Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2 align="center"><a href="#">Add New Emp</a></h2>
</body>
</html>
