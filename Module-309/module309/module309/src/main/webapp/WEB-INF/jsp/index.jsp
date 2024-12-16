<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Awet_Mohammed
  Date: 12/10/2024
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>

<body>
<h1>First Page</h1>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>response.addObject("customerFirstNames", firstNames);</h3>
<%--response.addObject("customerFirstNames", firstNames);--%>
<table border="1">
  <tr>
    <td>Contact First Name</td>
    <td>Contact Last Name</td>
    <td>id</td>
    <td>Customer Name</td>
  </tr>

  <c:forEach var="name" items="${customerFirstNames}">
    <tr>
      <td>${name.contactFirstname}</td>
      <td>${name.contactLastname}</td>
      <td>${name.id}</td>
      <td>${name.customerName}</td>
    </tr>
  </c:forEach>
</table>
  <c:forEach var="anything" begin="1" end="5">
    Item: <c:out value="${anything}"/><p>
  </c:forEach>
<c:forEach var="name" items="names">
    </c:forEach>

</body>

</html>
