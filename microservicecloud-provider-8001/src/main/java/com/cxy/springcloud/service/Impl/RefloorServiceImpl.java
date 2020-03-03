package com.cxy.springcloud.service.Impl;
import java.util.List;

import com.cxy.springcloud.entities.ReFloor;

import com.cxy.springcloud.common.Assist;
import com.cxy.springcloud.dao.RefloorDao;
import com.cxy.springcloud.service.RefloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefloorServiceImpl implements RefloorService {
    @Autowired
    private RefloorDao refloorDao;
    @Override
    public long getRefloorRowCount(Assist assist){
        return refloorDao.getRefloorRowCount(assist);
    }
    @Override
    public List<ReFloor> selectRefloor(Assist assist){
        return refloorDao.selectRefloor(assist);
    }
    @Override
    public ReFloor selectRefloorById(Integer id){
        return refloorDao.selectRefloorById(id);
    }
    @Override
    public int insertRefloor(ReFloor value){
        return refloorDao.insertRefloor(value);
    }
    @Override
    public int insertNonEmptyRefloor(ReFloor value){
        return refloorDao.insertNonEmptyRefloor(value);
    }
    @Override
    public int deleteRefloorById(Integer id){
        return refloorDao.deleteRefloorById(id);
    }
    @Override
    public int deleteRefloor(Assist assist){
        return refloorDao.deleteRefloor(assist);
    }
    @Override
    public int updateRefloorById(ReFloor enti){
        return refloorDao.updateRefloorById(enti);
    }
    @Override
    public int updateRefloor(ReFloor value, Assist assist){
        return refloorDao.updateRefloor(value,assist);
    }
    @Override
    public int updateNonEmptyRefloorById(ReFloor enti){
        return refloorDao.updateNonEmptyRefloorById(enti);
    }
    @Override
    public int updateNonEmptyRefloor(ReFloor value, Assist assist){
        return refloorDao.updateNonEmptyRefloor(value,assist);
    }

    public RefloorDao getRefloorDao() {
        return this.refloorDao;
    }

    public void setRefloorDao(RefloorDao refloorDao) {
        this.refloorDao = refloorDao;
    }

}