package com.cursojava.curso.dao;

import com.cursojava.curso.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public User getUser(Integer id) {
        String query = String.format("FROM User WHERE id='%d'",id);
        try {

            User res=entityManager.find(User.class , id);
            return res;

        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        String query = "FROM User";
        try {
            return entityManager.createQuery(query).getResultList();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String setUser(User user) {
        String query = String.format("INSERT INTO users (`Firstname`, `Lastname`, `Password`, `Email`, `Phone`) VALUES (%s, %s, %s, %s, %s);",user.getFirstName(),user.getLastName(),user.getPassword(),user.getEmail(),user.getPhone());
        try {
             entityManager.merge(user);
             return "Usuario creado";
        }catch (Exception e){
            System.out.println(e);
            return String.format("Ocurrio un error: %s",e);
        }
    }

    @Override
    public String putUser(Integer id, User user) {
        try {
            User userSelected = entityManager.find(User.class, id);
            entityManager.merge(userSelected,user);
            return "Usuario eliminado!";
        }catch (Exception e){
            System.out.println(e);
            return "Ocurrio un error";
        }
    }

    @Override
    public String deleteUser(Integer id) {
        try {
           User user = entityManager.find(User.class, id);
           entityManager.remove(user);
            return "Usuario eliminado!";
        }catch (Exception e){
            System.out.println(e);
            return "Ocurrio un error";
        }
    }
}
