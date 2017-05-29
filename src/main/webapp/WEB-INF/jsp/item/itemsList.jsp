<%--
  Created by IntelliJ IDEA.
  User: FGT
  Date: 2017/5/18
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>查询商品列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/item/queryItem.action" method="post">
    查询条件<table>
   <tr>
       <td><input type="submit" value="查询" /></td>
   </tr>
</table>
    商品列表<table>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>生产日期</td>
        <td>商品描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${itemsList}" var="item">
    <tr>
        <td>${item.name}</td>
        <td>${item.price}</td>
        <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd" /></td>
        <td>${item.detail}</td>
        <td><a href="${pageContext.request.contextPath}/item/editItem.action?id=${item.id}">修改</a></td>
    </tr>
    </c:forEach>
</table>
</form>

</body>
</html>
