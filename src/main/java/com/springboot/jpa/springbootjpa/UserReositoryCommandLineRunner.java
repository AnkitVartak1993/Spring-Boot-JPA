package com.springboot.jpa.springbootjpa;

import com.springboot.jpa.springbootjpa.entity.User;
import com.springboot.jpa.springbootjpa.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserReositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserReositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        userRepository.save(user);
        log.info("New user is created with id: "+ user);

        Optional<User> userWithId1 =  userRepository.findById(1L);
        log.info("User retrieved: "+ userWithId1);

        List<User> users = userRepository.findAll();
        log.info("All users: "+ users);

    }
}
