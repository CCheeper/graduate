package com.cxy.springcloud.dao;
import com.cxy.springcloud.entities.ReFloor;

import java.util.List;

import com.cxy.springcloud.common.Assist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RefloorDao{
    int getRefloorRowCount(Assist assist);
    List<ReFloor> selectRefloor(Assist assist);
    ReFloor selectRefloorById(Integer id);
    int insertRefloor(ReFloor value);
    int insertNonEmptyRefloor(ReFloor value);
    int deleteRefloorById(Integer id);
    int deleteRefloor(Assist assist);
    int updateRefloorById(ReFloor enti);
    int updateRefloor(@Param("enti") ReFloor value, @Param("assist") Assist assist);
    int updateNonEmptyRefloorById(ReFloor enti);
    int updateNonEmptyRefloor(@Param("enti") ReFloor value, @Param("assist") Assist assist);
}