package com.todo.controller;

import com.todo.dao.TodoDAO;
import com.todo.model.Todo;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateTodo")
public class UpdateTodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String status = request.getParameter("status");

        Todo todo = new Todo();
        todo.setId(id);
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setStatus(status);

        TodoDAO dao = new TodoDAO();
        dao.updateTodo(todo);

        response.sendRedirect("home.jsp");
    }
}
