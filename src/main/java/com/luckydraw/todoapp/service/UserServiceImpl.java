package com.luckydraw.todoapp.service;

import com.luckydraw.todoapp.model.User;
import com.luckydraw.todoapp.repository.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements ServiceInterface<User> {

    private UserDaoImpl userDao;

    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public void remove(User user) {
        userDao.remove(user);
    }

    @Override
    public Set<User> getAll() {
        return userDao.getAll();
    }
}
