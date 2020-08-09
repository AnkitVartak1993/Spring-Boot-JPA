package com.springboot.jpa.springbootjpa.service;

import com.springboot.jpa.springbootjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository  //It states that class is related to DB operations
@Transactional //Provides transaction features
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }

}
