<%@ taglib prefix="th" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 18395
  Date: 2020/4/12
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>

    <title>$Title$</title>
</head>
<body>
<table>
    <thread>
        <tr>
            <td>name</td>
            <td>password</td>
        </tr>
    </thread>
    <tbody>
    <th:forEach items = "${students}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.password}</td>
        </tr>
    </th:forEach>

    </tbody>
</table>
</body>
</html>
