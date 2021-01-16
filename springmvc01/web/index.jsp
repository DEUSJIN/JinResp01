<%--
  Created by IntelliJ IDEA.
  User: 19458
  Date: 2020/12/31
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  POJO--%>
    <form action="/testPOJO" method="post">
      <br>
      用户名称：<input type="text" name="name">
      <br>
      用户密码：<input type="password" name="password">
      <br>
      用户邮箱：<input type="text" name="email">
      <br>
      用户性别：男<input type="radio" name="gender" value="1">
                女<input type="radio" name="gender" value="0">
      <br>
      用户省份：<input type="text" name="address.province">
      <br>
      用户城市：<input type="text" name="address.city">
      <br>
      <input type="submit" value="注册">
      <br>
    </form>
<%--    查询--%>
    <a href="order/1001 ">REST GET</a>
<%--删除--%>
    <form action="order/1001" method="post">
      <input type="hidden" name="_method" value="delete">
      <input type="submit" value="REST DELETE">
    </form>
<%--修改--%>
    <form action="order" method="post">
      <input type="hidden" name="_method" value="put">
      <input type="submit" value="REST PUT">
    </form>
<%--添加--%>
    <form action="order" method="post">
      <input type="submit" value="REST POST">
    </form>
    <a href="/hello">Hello World!</a>
  </body>
</html>
