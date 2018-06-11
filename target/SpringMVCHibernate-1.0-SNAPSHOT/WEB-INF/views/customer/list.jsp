<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/8/18
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Customer</title>
    <link href="<c:url value="/static/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <script src="<c:url value="/static/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>

</head>
<body class="container">
<h3>List of Customers</h3>
<hr />

<a href="<c:url value="/customer/add" />" class="btn btn-success pull-right"><span class="glyphicon glyphicon-plus"></span> Add </a>
<br />
<br />
<table class="table table-striped table-bordered">

    <thead>
        <tr>
            <th>Name</th>
            <th>Address</th>
            <th>Gender</th>
            <th>Action</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="c" items="${customers}">
        <tr>
            <td>${c.firstName} ${c.lastName}</td>
            <td>${c.address}</td>
            <td>${c.gender}</td>
            <td>
                <a href="<c:url value="/customer/update/${c.id}"/>" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-pencil"></span> Edit </a>
                <a href="<c:url value="/customer/delete/${c.id}"/>" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure?')"><span class="glyphicon glyphicon-trash"></span> Delete </a>
            </td>
        </tr>
        </c:forEach>
    </tbody>

</table>

</body>
</html>
