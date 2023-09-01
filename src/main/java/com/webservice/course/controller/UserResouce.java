package com.webservice.course.controller;

import com.webservice.course.model.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Larissa", "larissa@gmail", "1234567", "51999755545");

        return ResponseEntity.ok().body(user);
    }
}
