package org.example.user.controllers;

import org.example.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1L, "John", "Cena");
        User user2 = new User(2L, "Brad", "Pitt");
        users.add(user1);
        users.add(user2);
        return users;
    }
}
