package com.luckydraw.todoapp.repository.impl;

import com.luckydraw.todoapp.model.User;
import com.luckydraw.todoapp.repository.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDaoImpl extends AbstractDao<User> {


    public UserDaoImpl(EntityManager em) {
        super(em);
        this.clazz = User.class;
    }
}
