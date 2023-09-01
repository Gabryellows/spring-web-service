package com.webservice.course.services;

import com.webservice.course.model.entities.User;
import com.webservice.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> returningObj = repository.findById(id);
        return returningObj.get();
    }


}
