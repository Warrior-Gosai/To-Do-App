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
ToDoList/
│── src/java/
│   ├── com.todo.controller/
│   │     ├── LoginServlet.java
│   │     ├── RegisterServlet.java
│   │     ├── AddTodoServlet.java
│   │     ├── EditTodoServlet.java
│   │     └── DeleteTodoServlet.java
│   │
│   ├── com.todo.dao/
│   │     ├── UserDAO.java
│   │     └── TodoDAO.java
│   │
│   └── com.todo.model/
│         ├── User.java
│         └── Todo.java
│
│── web/
│   ├── WEB-INF/
│   │     └── web.xml
│   ├── login.jsp
│   ├── register.jsp
│   ├── home.jsp
│   └── edit.jsp
│
│── nbproject/   (ignore, NetBeans configs)
│── build.xml    (ignore, auto-generated)



<b>MCA Sem-3 Advance Java Assignment ;)</b>
