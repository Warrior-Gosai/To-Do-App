package com.todo.controller;

import com.todo.dao.UserDAO;
import com.todo.model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        UserDAO userDao = new UserDAO();
        boolean result = userDao.register(user);

        if (result) {
            response.sendRedirect("login.jsp"); // success -> login page
        } else {
            response.getWriter().println("Registration failed :)");
        }
    }
}
