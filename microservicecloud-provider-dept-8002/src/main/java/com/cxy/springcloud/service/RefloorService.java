package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.ReFloor;

import java.util.List;

public interface RefloorService {
    public boolean add(ReFloor floor);

    public ReFloor get(int id);

    public List<ReFloor> list();

    public boolean delete(int id);

    public List<ReFloor> findLimit(int fnum,int bnum);
}
