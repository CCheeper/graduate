package com.cxy.springcloud.service.Impl;
import java.util.List;

import com.cxy.springcloud.entities.Discuss;

import com.cxy.springcloud.common.Assist;
import com.cxy.springcloud.dao.DiscussDao;
import com.cxy.springcloud.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussDao discussDao;
    @Override
    public long getDiscussRowCount(Assist assist){
        return discussDao.getDiscussRowCount(assist);
    }
    @Override
    public List<Discuss> selectDiscuss(Assist assist){
        return discussDao.selectDiscuss(assist);
    }
    @Override
    public Discuss selectDiscussById(Integer id){
        return discussDao.selectDiscussById(id);
    }
    @Override
    public int insertDiscuss(Discuss value){
        return discussDao.insertDiscuss(value);
    }
    @Override
    public int insertNonEmptyDiscuss(Discuss value){
        return discussDao.insertNonEmptyDiscuss(value);
    }
    @Override
    public int deleteDiscussById(Integer id){
        return discussDao.deleteDiscussById(id);
    }
    @Override
    public int deleteDiscuss(Assist assist){
        return discussDao.deleteDiscuss(assist);
    }
    @Override
    public int updateDiscussById(Discuss enti){
        return discussDao.updateDiscussById(enti);
    }
    @Override
    public int updateDiscuss(Discuss value, Assist assist){
        return discussDao.updateDiscuss(value,assist);
    }
    @Override
    public int updateNonEmptyDiscussById(Discuss enti){
        return discussDao.updateNonEmptyDiscussById(enti);
    }
    @Override
    public int updateNonEmptyDiscuss(Discuss value, Assist assist){
        return discussDao.updateNonEmptyDiscuss(value,assist);
    }

    public DiscussDao getDiscussDao() {
        return this.discussDao;
    }

    public void setDiscussDao(DiscussDao discussDao) {
        this.discussDao = discussDao;
    }

}