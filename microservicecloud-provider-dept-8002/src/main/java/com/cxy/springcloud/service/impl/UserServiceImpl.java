package com.cxy.springcloud.service.impl;

import java.util.List;


import com.cxy.springcloud.dao.UserDao;
import com.cxy.springcloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxy.springcloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public boolean add(User user) {
        return dao.addUser(user);
    }

    @Override
    public User get(int id) {
        return dao.findById(id);
    }

    @Override
    public List<User> list() {
        return dao.findAll();
    }

    @Override
    public boolean delete(int id) {
        return dao.deleteUser(id);
    }

    @Override
    public List<User> findLimit(int fnum, int bnum) {
        return dao.findLimit(fnum,bnum);
    }



}
