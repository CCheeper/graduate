package com.cxy.springcloud.service.impl;

import com.cxy.springcloud.dao.AdminUserDao;
import com.cxy.springcloud.dao.UserDao;
import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserDao dao;

    @Override
    public boolean add(AdminUser user) {
        return dao.addAdminUser(user);
    }

    @Override
    public AdminUser get(int id) {
        return dao.findById(id);
    }

    @Override
    public List<AdminUser> list() {
        return dao.findAll();
    }

    @Override
    public boolean delete(int id) {
        return dao.deleteAdminUser(id);
    }

    @Override
    public List<AdminUser> findLimit(int fnum, int bnum) {
        return dao.findLimit(fnum, bnum);
    }

}
