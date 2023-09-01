package com.webservice.course.config;

import com.webservice.course.model.entities.User;
import com.webservice.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "1234567", "990785987");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "123456", "998742565");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
