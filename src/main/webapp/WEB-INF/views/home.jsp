<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 29/04/2018
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<t:layout>
    <jsp:attribute name="pageTitle">
        <title>Accueil</title>
    </jsp:attribute>
    <jsp:body>
        <c:forEach items="${news}" var="newDto">
            <tr>
                <td>${newDto.getTitle()}</td>
                <td>${newDto.getContent()}</td>
            </tr>
        </c:forEach>
    </jsp:body>
</t:layout>
