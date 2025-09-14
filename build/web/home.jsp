<%@ page import="com.todo.model.User,com.todo.dao.TodoDAO,com.todo.model.Todo,java.util.List" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
    TodoDAO dao = new TodoDAO();
    List<Todo> todos = dao.getTodosByUser(user.getId());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home - ToDo App</title>
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
    <div class="container">
    <h2>Welcome, <%=user.getName()%>!</h2>
    <a href="logout">Logout</a>

    <form action="addTodo" method="post">
        <input type="text" name="title" placeholder="Task title" required>
        <textarea name="description" placeholder="Description"></textarea>
        <button type="submit">Add Task</button>
    </form>

    <table>
        <tr>
            <th>ID</th><th>Title</th><th>Description</th><th>Status</th><th>Action</th>
        </tr>
        <% for(Todo t : todos) { %>
        <tr>
            <td><%=t.getId()%></td>
            <td><%=t.getTitle()%></td>
            <td><%=t.getDescription()%></td>
            <td><%=t.getStatus()%></td>
            <td class="action-links">
                <a href="editTodo.jsp?id=<%=t.getId()%>">Edit</a>
                <a href="deleteTodo?id=<%=t.getId()%>" onclick="return confirm('Are you sure to delete ???');">Delete</a>
            </td>
        </tr>
        <% } %>
    </table>
</div>


    
</body>
</html>
