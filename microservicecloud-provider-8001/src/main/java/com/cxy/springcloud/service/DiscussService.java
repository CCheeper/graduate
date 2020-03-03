package com.cxy.springcloud.service;
import java.util.List;

import com.cxy.springcloud.entities.Discuss;

import com.cxy.springcloud.common.Assist;

public interface DiscussService{
    long getDiscussRowCount(Assist assist);
    List<Discuss> selectDiscuss(Assist assist);
    Discuss selectDiscussById(Integer id);
    int insertDiscuss(Discuss value);
    int insertNonEmptyDiscuss(Discuss value);
    int deleteDiscussById(Integer id);
    int deleteDiscuss(Assist assist);
    int updateDiscussById(Discuss enti);
    int updateDiscuss(Discuss value, Assist assist);
    int updateNonEmptyDiscussById(Discuss enti);
    int updateNonEmptyDiscuss(Discuss value, Assist assist);
}