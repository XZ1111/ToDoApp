package com.luckydraw.todoapp.repository.impl;

import com.luckydraw.todoapp.model.Role;
import com.luckydraw.todoapp.repository.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> {
    public RoleDaoImpl(EntityManager em) {
        super(em);
        this.clazz = Role.class;
    }
}
