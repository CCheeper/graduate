package com.cxy.springcloud.dao;
import com.cxy.springcloud.entities.Discuss;


import com.cxy.springcloud.common.Assist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DiscussDao{
    int getDiscussRowCount(Assist assist);
    List<Discuss> selectDiscuss(Assist assist);
    Discuss selectDiscussById(Integer id);
    int insertDiscuss(Discuss value);
    int insertNonEmptyDiscuss(Discuss value);
    int deleteDiscussById(Integer id);
    int deleteDiscuss(Assist assist);
    int updateDiscussById(Discuss enti);
    int updateDiscuss(@Param("enti") Discuss value, @Param("assist") Assist assist);
    int updateNonEmptyDiscussById(Discuss enti);
    int updateNonEmptyDiscuss(@Param("enti") Discuss value, @Param("assist") Assist assist);
}