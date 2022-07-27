package com.cursojava.curso.dao;

import com.cursojava.curso.models.User;

import java.util.List;

public interface UserDao {
    User getUser(Integer id);
    List<User>  getUsers();
    String setUser(User user);
    String putUser();
    String deleteUser(Integer id);
}
