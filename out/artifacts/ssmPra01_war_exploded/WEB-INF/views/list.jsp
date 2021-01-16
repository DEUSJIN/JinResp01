<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/13
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<table align="center" width="70%" cellspacing="0px" border="1px">
    <tr>
        <th>Id</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Gender</th>
        <th>DeptName</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr align="center">
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.gender==1?"男":"女"}</td>
            <td>${emp.department.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
