package com.example.demo.config;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("demo2")
public class Demo2Config implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Anderson Silva", "spiderbr@gmail.com", "987652432", "123456");
        User u2 = new User(null, "Alex Pereira", "poatanbr@gmail.com", "987634432", "234567");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
