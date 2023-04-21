package com.devcoast.ProjectWeb.service;


import com.devcoast.ProjectWeb.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImplement implements UserService {
    static final List<User> users = new ArrayList<>(List.of(
            new User(1, "Marcus", "Gonzalez", "marcus.sea13@gmail.com", "marcus123"),
            new User(2, "Marco", "Gonzalez", "marcogonzalez@gmail.com", "marco123")
            ));

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User findUserById(int id) {
        return users.stream().filter(userQuery -> userQuery.getId() == id).findFirst().orElse(new User());
    }

    @Override
    public User findUserByName(String name) {
        return users.stream().filter(userQuery -> userQuery.getName().equals(name)).findFirst().orElse(new User());
    }


}
