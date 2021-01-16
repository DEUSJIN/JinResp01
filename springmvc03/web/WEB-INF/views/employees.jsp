<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2021/1/7
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employees</title>
    <script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
        $(function(){
           //给删除<a>动态绑定事件
            $(".del").click(function () {
                //确认是否要删除
                var flag = window.confirm("是否删除?");
                if(!flag){
                    return false;
                }
                //this:当前点击的对象，dom对象,编程jQuery对象
                //获取超链接href的值
                var href = $(this).attr("href");
                //将href的值设置到表单的action上
                $("form").attr("action",href).submit();
                //取消<a>的默认行为
                return false;
            });
        });
    </script>
</head>
<body>
    <form action="" method="post" id="deleteForm">
        <input type="hidden" name="_method" value="delete">
    </form>

    <h1 align="center"><font color="blue">Employee List</font></h1>
    <table width="60%" cellspacing="0px" border="1px" align="center">
        <tr>
            <th>Id</th>
            <th>lastName</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Department</th>
            <th>Option</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr align="center">
                <td>${employee.id}</td>
                <td>${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.gender==0?"女":"男"}</td>
                <td>${employee.departmentId}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/toEditEmployee/${employee.id}">Edit</a>
                    <a class="del" href="${pageContext.request.contextPath}/deleteEmployee/${employee.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h2 align="center" ><a href="${pageContext.request.contextPath}/toAddEmployee">Add Employee</a> </h2>
</body>
</html>
