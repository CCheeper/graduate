package com.cxy.springcloud.service.impl;

import com.cxy.springcloud.dao.RefloorDao;
import com.cxy.springcloud.entities.ReFloor;
import com.cxy.springcloud.service.RefloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefloorServiceImpl implements RefloorService {
    @Autowired
    private RefloorDao dao;

    @Override
    public boolean add(ReFloor floor) {
        return dao.addFloor(floor);
    }

    @Override
    public ReFloor get(int id) {
        return dao.findById(id);
    }

    @Override
    public List<ReFloor> list() {
        return dao.findAll();
    }

    @Override
    public boolean delete(int id) {
        return dao.deleteFloor(id);
    }

    @Override
    public List<ReFloor> findLimit(int fnum, int bnum) {
        return dao.findLimit(fnum, bnum);
    }

}
