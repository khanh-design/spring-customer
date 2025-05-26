<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/26/2025
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Detail</title>
</head>
<body>
<h1>Customer Details</h1>
<p><strong>ID:</strong> ${customer.id}</p>
<p><strong>Name:</strong> ${customer.name}</p>
<p><strong>Email:</strong> ${customer.email}</p>
<p><strong>Address:</strong> ${customer.address}</p>
<a href="/customers">Back to list</a>
</body>
</html>
