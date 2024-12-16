<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: Awet_Mohammed
  Date: 12/16/2024
  Time: 10:24 AM
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
  <body>

  <jsp:include page="../include/header.jsp"/>
  <h1 class="text-center">Employee Search</h1>

  <form class="pb-5">
    <div class="container bg-header">
      <div class="row pt-3 justify-content-center">
        <div class="col-6">

          <div class="mb-3">
            <label for="id" class="form-label">Employee Id</label>
            <input type="text" class="form-control" id="id" name="id">
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

<%--  <c:if test="${employee != null }">--%>
<%--    <section>--%>
<%--      <div class="container">--%>
<%--        <h2 class="text-center pt-5">Customers Found (${customerList.size()})</h2>--%>
<%--      </div>--%>
<%--    </section>--%>
<%--  </c:if>--%>
  <%--<h2>{customersList.size()}</h2>--%>
  <table border="1" class="table mt-5">
    <tr>
      <th>Id</th>
      <th>Office Id</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Extension</th>
      <th>Email</th>
      <th>Job Title</th>
      <th>Edit</th>
    </tr>

      <tr>
        <td>${employee.id}</td>
        <td>${employee.officeId}</td>
        <td>${employee.firstname}</td>
        <td>${employee.lastname}</td>
        <td>${employee.extension}</td>
        <td>${employee.email}</td>
        <td>${employee.jobTitle}</td>

        <td><a  href="employee/edit/${employee.id}">Edit</a></td>
      </tr>

  </table>
  <jsp:include page="../include/footer.jsp"/>
  </body>
</html>
