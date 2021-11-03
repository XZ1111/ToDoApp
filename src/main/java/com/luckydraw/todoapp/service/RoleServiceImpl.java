package com.luckydraw.todoapp.service;

import com.luckydraw.todoapp.model.Role;
import com.luckydraw.todoapp.repository.impl.RoleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements ServiceInterface<Role> {

    private RoleDaoImpl roleDao;

    @Autowired
    public RoleServiceImpl(RoleDaoImpl roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getById(Long id) {
        return roleDao.getById(id);
    }

    @Override
    public Role create(Role role) {
        return roleDao.create(role);
    }

    @Override
    public void remove(Role role) {
        roleDao.remove(role);
    }

    @Override
    public Set<Role> getAll() {
        return roleDao.getAll();
    }
}
