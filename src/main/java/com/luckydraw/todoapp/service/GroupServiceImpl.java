package com.luckydraw.todoapp.service;


import com.luckydraw.todoapp.model.Group;
import com.luckydraw.todoapp.repository.impl.GroupDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class GroupServiceImpl implements ServiceInterface<Group> {

    private GroupDaoImpl groupDao;


    @Autowired
    public GroupServiceImpl(GroupDaoImpl groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public Group getById(Long id) {
        return groupDao.getById(id);
    }

    @Override
    public Group create(Group group) {
        return groupDao.create(group);
    }

    @Override
    public void remove(Group group) {
        groupDao.remove(group);
    }

    @Override
    public Set<Group> getAll() {
        return groupDao.getAll();
    }
}
