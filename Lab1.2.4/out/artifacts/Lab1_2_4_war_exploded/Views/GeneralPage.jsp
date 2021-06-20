<%--
  Created by IntelliJ IDEA.
  User: ulana
  Date: 27.02.2020
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab4</title>
</head>
<body>
<form action="CountStudent" method="get">
    <p>Общее количество студентов:</p>
    <input type="submit" value="Показать">
</form>
<form action="BiggestFacultyServlet" method="get">
    <p>Самый большой факультет:</p>
    <input type="submit" value="Показать">
</form>
<form action="BestStudentServlet" method="get">
    <p>Лучшие студенты:</p>
    <input type="submit" value="Показать">
</form>
</body>
</html>
