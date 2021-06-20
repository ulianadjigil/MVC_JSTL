<%--
  Created by IntelliJ IDEA.
  User: ulana
  Date: 28.02.2020
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab4</title>
</head>
<body>
Количество студентов:
<c:out value="${requestScope.studentAmount}" default="Не хочу показывать"/>
</body>
</html>