
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<t:layout>
    <jsp:attribute name="pageTitle">
        <title>Login</title>
    </jsp:attribute>
    <jsp:body>
        <form:form action="login/doLogin" method="post" modelAttribute="user">
            <table>
                <tr>
                    <td>Email</td>
                    <td> : <form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td> : <form:password path="password" /></td>
                </tr>
                <tr>
                    <td><button type="submit">Login</button></td>
                </tr>
            </table>
        </form:form>
    </jsp:body>
</t:layout>