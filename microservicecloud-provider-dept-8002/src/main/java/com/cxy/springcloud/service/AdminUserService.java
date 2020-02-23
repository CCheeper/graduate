package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.AdminUser;


import java.util.List;

public interface AdminUserService {
    public boolean add(AdminUser user);

    public AdminUser get(int id);

    public List<AdminUser> list();

    public boolean delete(int id);

    public List<AdminUser> findLimit(int fnum,int bnum);
}
