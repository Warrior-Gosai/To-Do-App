package com.todo.controller;

import com.todo.dao.TodoDAO;
import com.todo.model.Todo;
import com.todo.model.User;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addTodo")
public class AddTodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String title = request.getParameter("title");
        String description = request.getParameter("description");

        Todo todo = new Todo();
        todo.setUserId(user.getId());
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setStatus("pending");

        TodoDAO dao = new TodoDAO();
        dao.addTodo(todo);

        response.sendRedirect("home.jsp");
    }
}
