package com.luckydraw.todoapp.repository.impl;

import com.luckydraw.todoapp.model.Group;
import com.luckydraw.todoapp.repository.AbstractDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class GroupDaoImpl extends AbstractDao<Group> {

    public GroupDaoImpl(EntityManager em) {
        super(em);
        this.clazz = Group.class;
    }
}
