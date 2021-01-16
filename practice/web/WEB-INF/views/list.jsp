<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/3
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Customers</title>
</head>
<body>
    <h1 align="center">员工信息列表</h1>
    <table border="1px" align="center" width="70%" cellspacing="0px">
        <tr>
            <th>Id</th>
            <th>Password</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Balance</th>
            <th>Operation</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr align="center">
                <td>${customer.id}</td>
                <td>${customer.password}</td>
                <td>${customer.name}</td>
                <td>${customer.gender==1?"男":"女"}</td>
                <td>${customer.balance}</td>
                <td>
                    <a href="#">Edit</a>
                    &nbsp;&nbsp;
                    <a href="#">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h2 align="center"><a href="/addCustomer">Add Customer</a></h2>
</body>
</html>
