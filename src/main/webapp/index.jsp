<%--
  Created by IntelliJ IDEA.
  User: kyyet
  Date: 2020-11-06
  Time: 오후 7:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    div {display: flex;}
    ul {width: 100%; display: flex; justify-content: space-evenly;}
    div ul li{list-style: none; display: inline-flex;}
    div ul li a{text-decoration: underline; color : black;}
</style>
<body>
<div>
    <ul>
        <li><a href="/insert.jsp">성적입력</a></li>
        <li><a href="/select.jsp">성적조회</a></li>
        <li><a href="/modify.jsp">성적수정</a></li>
        <li><a href="/selectAll.jsp">전체조회</a></li>
    </ul>
</div>
</body>
</html>
