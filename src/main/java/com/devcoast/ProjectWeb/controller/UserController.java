package com.devcoast.ProjectWeb.controller;

import com.devcoast.ProjectWeb.model.User;
import com.devcoast.ProjectWeb.service.UserService;
import com.devcoast.ProjectWeb.service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/users" )
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

}
