package com.springboot.jpa.springbootjpa;

import com.springboot.jpa.springbootjpa.entity.User;
import com.springboot.jpa.springbootjpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
    UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("John", "Admin");
        long newUserId= userDAOService.insert(user);
        log.info("New user is created with id: "+ newUserId);

    }
}
