<%@ page import="com.todo.dao.TodoDAO,com.todo.model.Todo" %>
<%
    String idStr = request.getParameter("id");
    int id = Integer.parseInt(idStr);

    TodoDAO dao = new TodoDAO();
    Todo todo = null;
    for (Todo t : dao.getTodosByUser(((com.todo.model.User) session.getAttribute("user")).getId())) {
        if (t.getId() == id) {
            todo = t;
            break;
        }
    }
    if (todo == null) {
        response.sendRedirect("home.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Task</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="container">
            <h2>Edit Task</h2>
            <form action="updateTodo" method="post">                
                <input type="hidden" name="id" value="<%=todo.getId()%>">
                
                <label>Title : </label>
                <input type="text" name="title" value="<%=todo.getTitle()%>" required>
                
                <label>Description : </label>
                <textarea name="description" required><%=todo.getDescription()%></textarea>
                
                <label>Status : </label>
                <select name="status">
                    <option value="pending" <%=todo.getStatus().equals("pending") ? "selected" : ""%>>Pending</option>
                    <option value="done" <%=todo.getStatus().equals("done") ? "selected" : ""%>>Done</option>
                </select>
                <button type="submit">Update</button>
            </form>
            <br>
            <a href="home.jsp">Back</a>
        </div>
    </body>
</html>
