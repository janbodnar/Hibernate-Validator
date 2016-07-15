<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting</title>
    </head>
    <body>
        Hello <c:out value="${param.username}"/>! <br>
        Your email is <c:out value="${param.email}"/>.
    </body>
</html>
