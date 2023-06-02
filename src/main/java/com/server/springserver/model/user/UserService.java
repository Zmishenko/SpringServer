package com.server.springserver.model.user;

import com.server.springserver.model.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUserByName(String login, String password) {
        User user = repository.findByLogin(login);
        user.setAuthorized(user.getPassword().equals(password));

        return user;
    }
}
