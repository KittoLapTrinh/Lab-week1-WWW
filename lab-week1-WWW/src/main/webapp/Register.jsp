<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 20/09/2023
  Time: 2:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background-color: #f4f4f4;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        .register-container {
            max-width: 400px;
            background-color: #ffffff;
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Ký</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6 register-container">
            <h2 class="text-center">Register</h2>
            <form action="control-servlet" method="post">
                <div class="mb-3">
                    <%--@declare id="id"--%><label for="id" class="form-label">ID</label>
                    <input type="text" class="form-control" id="accountId" name="id" required>
                </div>
                <div class="mb-3">
                    <label for="fullname" class="form-label">FullName</label>
                    <input type="text" class="form-control" id="fullname" name="fullname" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>
                <div class="mb-3">
                    <label for="confirm-password" class="form-label">Enter the password</label>
                    <input type="password" class="form-control" id="confirm-password" name="confirm-password" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label">Phone</label>
                    <input type="tel" class="form-control" id="phone" name="phone" required>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Register an account</button>
                <input type="hidden" name="action" value="register">
            </form>
            <p class="mt-3 text-center">Do you already have an account? <a href="index.jsp">Login</a></p>
        </div>
    </div>
</div>

</body>
</html>
