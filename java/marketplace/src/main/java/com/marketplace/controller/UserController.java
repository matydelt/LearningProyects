package com.marketplace.controller;

import com.marketplace.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/User")
public class UserController {

    @GetMapping("/All")
    public List<User> findAll(){
        return null;
    }
    @GetMapping("/:id")
    public String Auth(@PathVariable int id){
        return null;
    }
    @PostMapping("/CreateUser")
    public void Create(){

    }
}
