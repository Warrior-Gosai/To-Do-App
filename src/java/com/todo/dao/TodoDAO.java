package com.todo.dao;

import com.todo.model.Todo;
import java.sql.*;
import java.util.*;

public class TodoDAO {
    private Connection conn;

    public TodoDAO() {
        conn = DBConnection.getConnection();
    }

    // Add Todo
    public boolean addTodo(Todo todo) {
        try {
            String sql = "INSERT INTO todos (user_id, title, description, status) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, todo.getUserId());
            ps.setString(2, todo.getTitle());
            ps.setString(3, todo.getDescription());
            ps.setString(4, todo.getStatus());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // List all Todos by user
    public List<Todo> getTodosByUser(int userId) {
        List<Todo> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM todos WHERE user_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setId(rs.getInt("id"));
                todo.setUserId(rs.getInt("user_id"));
                todo.setTitle(rs.getString("title"));
                todo.setDescription(rs.getString("description"));
                todo.setStatus(rs.getString("status"));
                list.add(todo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Update Todo
    public boolean updateTodo(Todo todo) {
        try {
            String sql = "UPDATE todos SET title=?, description=?, status=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, todo.getTitle());
            ps.setString(2, todo.getDescription());
            ps.setString(3, todo.getStatus());
            ps.setInt(4, todo.getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete Todo
    public boolean deleteTodo(int id) {
        try {
            String sql = "DELETE FROM todos WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
