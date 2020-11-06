<%--
  Created by IntelliJ IDEA.
  User: kyyet
  Date: 2020-11-06
  Time: 오후 7:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        div { display: flex; flex-direction: column; align-content: center;}
        div p {display: inline-flex; align-self: center;}
        div form {display: inline-flex; align-self: center;}
        .submitArea {margin: 0 auto; text-align: center;}
        .submitArea input {padding: 5px; margin: 5px;}
        tr td:first-child {width: 50px;}
    </style>
</head>
<body>
<div>
    <p>성적입력</p>
    <form method="post" action="/insert.do">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="number" size="15"/> </td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" size="15"/> </td>
            </tr>
            <tr>
                <td>국어</td>
                <td><input type="text" name="kor" size="15"/> </td>
            </tr>
            <tr>
                <td>영어</td>
                <td><input type="text" name="eng" size="15"/> </td>
            </tr>
            <tr>
                <td>수학</td>
                <td><input type="text" name="mat" size="15"/> </td>
            </tr>
            <tr>
                <td colspan="2" class="submitArea">
                    <input type="submit" value="등록" />
                    <input type="reset" value="다시쓰기">
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
