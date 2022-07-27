package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UserDao;
import com.cursojava.curso.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "users/{id}")
    public User getUser(@PathVariable Integer id){
        try{

            return userDao.getUser(id);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    @RequestMapping(value = "users")
    public List<User> getUsers(){
        try{
            return userDao.getUsers();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public String setUser(@RequestBody User user){
        try{
            return userDao.setUser(user);
        }catch (Exception e){
            System.out.println(e);
            return String.format("Ocurrio un error %s",e);
        }
    }

    @RequestMapping(value = "users", method = RequestMethod.PUT)
    public String putUser(){
        try{
            userDao.putUser();
            return userDao.putUser();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id){
        try{
            userDao.deleteUser(id);
            return String.format("usuario:%d ,eliminado",id);
        }catch (Exception e){
            System.out.println(e);
            return String.format("Ocurrio un error %s",e);
        }
    }
}
