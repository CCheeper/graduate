package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Discuss;

import java.util.List;

public interface DiscussService {
    public boolean add(Discuss discuss);

    public Discuss get(int id);

    public List<Discuss> list();

    public boolean delete(int id);

    public List<Discuss> findLimit(int fnum,int bnum);
}
