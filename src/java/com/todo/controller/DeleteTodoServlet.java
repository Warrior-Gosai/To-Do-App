package com.todo.controller;

import com.todo.dao.TodoDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteTodo")
public class DeleteTodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        TodoDAO dao = new TodoDAO();
        dao.deleteTodo(id);

        response.sendRedirect("home.jsp");
    }
}
