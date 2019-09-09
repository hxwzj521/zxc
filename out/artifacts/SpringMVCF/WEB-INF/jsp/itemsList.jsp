<%--
  Created by IntelliJ IDEA.
  User: 流川川
  Date: 2019/8/27
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <title>Title</title>
</head>
<body>
list:
<table width="100%" boder="1">
    <tr>
        <td>name</td>
        <td>price</td>
        <td>detail</td>
    </tr>
    <c:forEach items="${itemList}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.detail}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
