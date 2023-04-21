package com.devcoast.ProjectWeb.service;

import com.devcoast.ProjectWeb.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public abstract List<User> findAllUsers();
    public abstract User findUserById(int id);

    public abstract User findUserByName(String name);


}
