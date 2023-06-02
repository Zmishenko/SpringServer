package com.server.springserver.controller;

import javax.validation.Valid;
import com.server.springserver.model.user.User;
import com.server.springserver.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/authentication/login")
    public User login(@Valid @RequestBody User user) {
        user.setAuthorized(false);
        List<User> users = userService.findAll();

        for (User userFromBD: users) {
            if (userFromBD.getPassword().equals(user.getPassword()) && userFromBD.getPassword().equals(user.getPassword())) {
                user.setAuthorized(true);
                return userFromBD;
            }
        }

        return user;


//    @GetMapping("/authentication/{login}/{password}")
//    public User getUserById(@PathVariable String login, @PathVariable String password) {
//        return userService.getUser(login, password);
//    }

}
}
