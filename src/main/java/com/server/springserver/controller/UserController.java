package com.server.springserver.controller;

import javax.validation.Valid;
import com.server.springserver.model.user.User;
import com.server.springserver.model.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/authentication/login/{login}/{password}")
    public User findUser(@PathVariable String login, @PathVariable String password) {
        User user = userService.findUser(login, password);
        return user;
    }
}
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//    @PostMapping("/authentication/login")
//    public User login(@Valid @RequestBody User user) {
//        return userService.getUser(user);
//    }
//}
