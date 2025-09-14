# 📝 To-Do App (JSP + JDBC)

A **To-Do List web application** built using **JSP (Java Server Pages)**, **Servlets**, and **JDBC** for database connectivity.  
This app allows users to add, update, delete, and mark tasks as completed.

---

## 🚀 Features
- ✅ Add new tasks
- ✏️ Edit existing tasks
- ❌ Delete tasks
- 🎯 Mark tasks as complete/incomplete
- 🗄️ Store tasks in a relational database

---

## 🛠️ Tech Stack
- **Frontend**: JSP, HTML, CSS
- **Backend**: Java (Servlets + JSP)
- **Database**: MySQL (via JDBC)
- **Server**: Apache Tomcat

---

## 📂 Project Structure
ToDoList/<br/>
│── src/java/<br/>
│   ├── com.todo.controller/<br/>
│   │     ├── LoginServlet.java<br/>
│   │     ├── RegisterServlet.java<br/>
│   │     ├── AddTodoServlet.java<br/>
│   │     ├── EditTodoServlet.java<br/>
│   │     └── DeleteTodoServlet.java<br/>
│   │<br/>
│   ├── com.todo.dao/<br/>
│   │     ├── UserDAO.java<br/>
│   │     └── TodoDAO.java<br/>
│   │<br/>
│   └── com.todo.model/<br/>
│         ├── User.java<br/>
│         └── Todo.java<br/>
│<br/>
│── web/<br/>
│   ├── WEB-INF/<br/>
│   │     └── web.xml<br/>
│   ├── login.jsp<br/>
│   ├── register.jsp<br/>
│   ├── home.jsp<br/>
│   └── edit.jsp<br/>
│<br/>
│── nbproject/   (ignore, NetBeans configs)<br/>
│── build.xml    (ignore, auto-generated)<br/>

<br/>
<br/>

<b>MCA Sem-3 Advance Java Assignment ;)</b>
