package com.server.springserver.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUser(String login, String password) {
        User user = repository.findByLogin(login);
        user.setAuthorized(user.getPassword().equals(password));

        return user;
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
