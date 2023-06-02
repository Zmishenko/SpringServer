package com.server.springserver.controller;

import com.server.springserver.model.user.User;
import com.server.springserver.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/authentication/{login}/{password}")
    public User getUserById(@PathVariable String login, @PathVariable String password) {
        return userService.getUserByName(login, password);
    }
}
