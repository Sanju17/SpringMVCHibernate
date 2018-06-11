<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update Customer</title>
    <link href="<c:url value="/static/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <script src="<c:url value="/static/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>

</head>
<body class="container">

<h3>Update Customer</h3>
<hr/>

<a href="<s:url value="/customer/list"/> " class="btn btn-primary pull-right"><span
        class="glyphicon glyphicon-home"></span> Home</a>
<br/>
<br/>
<s:url value="/customer/update" var="saveUrl"/>
<form:form action="${saveUrl}" method="post" modelAttribute="customer">
    <form:hidden path="id"/>

    <div class="form-group">
        <label for="firstname">First Name:</label>
        <form:input path="firstName" class="form-control" id="firstname"/>
    </div>
    <div class="form-group">
        <label for="lastname">Last Name:</label>
        <form:input path="lastName" class="form-control" id="lastname"/>
    </div>
    <div class="form-group">
        <label for="address">Address:</label>
        <form:input path="address" class="form-control" id="address"/>
    </div>
    <div>
        <label>Gender</label>
        <div class="radio-inline">
            <form:radiobutton path="gender" value="Male"/> Male
        </div>
        <div class="radio-inline">
            <form:radiobutton path="gender" value="Female"/> Female
        </div>
    </div>
    <br/>
    <button type="submit" class="btn btn-default">Submit</button>
</form:form>

</body>
</html>
