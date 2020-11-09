<%@ page import="VO.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kyyet
  Date: 2020-11-09
  Time: 오후 2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Student> list = (List)request.getAttribute("list");
%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        div {display: flex; justify-content: center; flex-direction: column;}
        p { display: flex; align-self: center; text-align: center;}
        table {display: inline-flex; justify-content: center;}
        table tr td{text-align: center;}
        input[type=text] {text-align: center;}
    </style>
</head>
<body>
<div>
    <p>전체조회</p>
    <table>
        <tr>
            <td>번호</td>
            <td>이름</td>
            <td>국어</td>
            <td>영어</td>
            <td>수학</td>
        </tr>
        <%
            if(list != null){
                for(int i=0;i<list.size();i++){
        %>
                    <tr>
                        <td><input type="text" name="number" value="<%=list.get(i).getNo()%>" size="4" disabled></td>
                        <td><input type="text" name="name" value="<%=list.get(i).getName()%>" disabled></td>
                        <td><input type="text" name="kor" value="<%=list.get(i).getKor()%>" disabled></td>
                        <td><input type="text" name="eng" value="<%=list.get(i).getEng()%>" disabled></td>
                        <td><input type="text" name="mat" value="<%=list.get(i).getMat()%>" disabled></td>
                    </tr>
        <%
                }
            }else{
        %>
        <tr>
            <td colspan="5">유저 정보가 없습니다.</td>
        </tr>
        <% }%>
        <tr>
            <td colspan="5" style="padding-top: 10px;"><button onclick="location.href='./index.jsp'">확인</button></td>
        </tr>
    </table>
</div>
</body>
</html>
