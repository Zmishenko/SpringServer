package com.server.springserver.model.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUser(String login, String password) {
        Optional<User> optionalUser = userRepository.findByLogin(login);
        if (!optionalUser.get().getPassword().equals(password)) {
            optionalUser = Optional.empty();
        }

        return optionalUser.orElseThrow();
    }
}
