<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login - ToDo App</title>
        <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background-color: #ebd6fd;
                color: #111;
                line-height: 1.6;
            }
            .login-container {
                margin-top: 100px;
                display: flex;
                justify-content: center;
                align-items: center;
                flex: 1;
                padding: 2rem;
            }

            .login-box {
                background: #fff;
                padding: 2rem;
                border-radius: 10px;
                max-width: 400px;
                width: 100%;
                text-align: center;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            }

            .login-box h2 {
                font-size: 1.7rem;
                margin-bottom: 0.5rem;
            }

            .login-box p {
                font-size: 0.95rem;
                color: #666;
                margin-bottom: 1.5rem;
            }

            .login-btn {
                width: 50%;
                padding: 0.75rem;
                background-color: #6b21a8;
                color: #fff;
                border: none;
                border-radius: 6px;
                font-weight: bold;
                font-size: 1rem;
                margin-top: 0.5rem;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <main class="login-container">    
            <form action="login" method="post" class="login-box">
                <h2>User Login</h2>
                <label>Email:</label>
                <input type="email" name="email" placeholder="Enter email" required><br><br>

                <label>Password:</label>
                <input type="password" name="password" placeholder="Enter password" required><br><br>

                <button type="submit" class="login-btn">Login</button>

                <p>Don't have an account? <a href="register.jsp">Register here</a></p>
            </form>
    </body>
</html>
