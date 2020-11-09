<%@ page import="VO.Student" %><%--
  Created by IntelliJ IDEA.
  User: kyyet
  Date: 2020-11-09
  Time: 오후 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student vo = (Student) request.getAttribute("vo");
    String name = "";String kor = "";String eng = "";String mat = "";
    if(vo != null){
        name = vo.getName(); kor = String.valueOf(vo.getKor());
        eng = String.valueOf(vo.getEng()); mat = String.valueOf(vo.getMat());
    }
%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        div { display: flex; flex-direction: column; align-content: center;}
        div p {display: inline-flex; align-self: center;} div form {display: inline-flex; align-self: center;}
        .submitArea {margin: 0 auto; text-align: center;} .submitArea input {padding: 5px; margin: 5px;}
        tr td:first-child {width: 50px;} </style>
</head>
<body>
<div>
    <p>성적조회</p>
    <form method="post" action="/select.do">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="number" size="15"/> </td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" size="15" value="<%=name%>" disabled/> </td>
            </tr>
            <tr>
                <td>국어</td>`
                <td><input type="text" name="kor" size="15" value="<%=kor%>"  disabled/> </td>
            </tr>
            <tr>
                <td>영어</td>
                <td><input type="text" name="eng" size="15" value="<%=eng%>"  disabled/> </td>
            </tr>
            <tr>
                <td>수학</td>
                <td><input type="text" name="mat" size="15" value="<%=mat%>" disabled/> </td>
            </tr>
            <tr>
                <td colspan="2" class="submitArea">
                    <input type="submit" value="확인" />
                    <input type="button" value="뒤로가기" onclick="location.href='./index.jsp';" />
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
