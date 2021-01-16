<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/7
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <div align="center">
        <form:form action="${pageContext.request.contextPath}/addEmployee" method="post">
            <c:if test="${!empty employee}" var="flag">
                <input type="hidden" name="_method" value="PUT">
            </c:if>
            <br>
            Id:<form:input path="id"></form:input>
            <br>
            LastName:<form:input path="lastName"></form:input>
            <br>
            Email:<form:input path="email"></form:input>
            <br>
            Gender:<form:radiobuttons path="gender" items="${genderMap}"></form:radiobuttons>
            <br>
            deptName:<form:select path="departmentId" items="${departs}" itemLabel="name" itemValue="id"></form:select>
            <br>
            <c:if test="${flag}">
                <input type="submit" value="修改">
            </c:if>
            <c:if test="${!flag}">
                <input type="submit" value="添加">
            </c:if>
        </form:form>
    </div>
</body>
</html>
