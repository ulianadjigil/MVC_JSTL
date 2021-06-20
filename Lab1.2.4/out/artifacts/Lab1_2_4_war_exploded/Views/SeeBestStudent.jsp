<%--
  Created by IntelliJ IDEA.
  User: ulana
  Date: 28.02.2020
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab4</title>
</head>
<body>
<c:if test="${requestScope.bestStudent == null}">
    <c:redirect url="/Views/Sorry.jsp" />
</c:if>
<c:if test="${requestScope.bestStudent != null}">
    Лучшие студенты:
    <c:forEach var="stud" items="${requestScope.bestStudent}">
        <li><c:out value="${pageScope.stud.getName()}" default="Студент"> </c:out>,
            балов:<c:out value="${pageScope.stud.getScore()}" default="Удовлетворительный"> </c:out></li>
    </c:forEach>
</c:if>
</body>
</html>