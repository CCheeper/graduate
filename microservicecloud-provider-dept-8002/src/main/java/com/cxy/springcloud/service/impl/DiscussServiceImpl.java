package com.cxy.springcloud.service.impl;


import com.cxy.springcloud.dao.DiscussDao;
import com.cxy.springcloud.entities.Discuss;
import com.cxy.springcloud.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussDao dao;

    @Override
    public boolean add(Discuss user) {
        return dao.addDiscuss(user);
    }

    @Override
    public Discuss get(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Discuss> list() {
        return dao.findAll();
    }

    @Override
    public boolean delete(int id) {
        return dao.deleteDiscuss(id);
    }

    @Override
    public List<Discuss> findLimit(int fnum, int bnum) {
        return dao.findLimit(fnum, bnum);
    }

}
