<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <p>
            <c:forEach var="err" items="${errMsg}">
                <c:out value="${err}"/>
                <br>
            </c:forEach>
        </p>
    </body>
</html>
