<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: Awet_Mohammed
  Date: 12/13/2024
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- these 2 lines are needed to bring in bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <link href="../../webapp/pub/css/global.css" rel="stylesheet">
</head>
<style>
    /*form{*/
    /*    background-color: #a4c6c6;*/
    /*}*/
</style>
<body>

<jsp:include page="../include/header.jsp"/>
<h1 class="text-center">Customer Search</h1>

<form class="pb-5">
    <div class="container bg-header">
        <div class="row pt-3 justify-content-center">
            <div class="col-6">

                <div class="mb-3">
                    <label for="firstName" class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName">
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-6">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </div>

    </div>
</form>
<%--@elvariable id="customersList" type="com.sun.java.accessibility.util.Translator"--%>

<c:if test="${customerList.size() > 0 }">
    <section>
        <div class="container">
            <h2 class="text-center pt-5">Customers Found (${customerList.size()})</h2>
        </div>
    </section>
</c:if>
<%--<h2>{customersList.size()}</h2>--%>
<table border="1" class="table mt-5">
    <tr>
        <th>Contact First Name</th>
        <th>Contact Last Name</th>
        <th>id</th>
        <th>Customer Name</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.contactFirstname}</td>
            <td>${customer.contactLastname}</td>
            <td>${customer.id}</td>
            <td>${customer.customerName}</td>
            <td><a  href="/customer/edit/${customer.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="../include/footer.jsp"/>

<!-- jquery is always loaded at the top of the file because its needed by so many other libraries -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>
