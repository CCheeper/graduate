package com.cxy.springcloud.service;
import java.util.List;

import com.cxy.springcloud.entities.ReFloor;

import com.cxy.springcloud.common.Assist;

public interface RefloorService{
    long getRefloorRowCount(Assist assist);
    List<ReFloor> selectRefloor(Assist assist);
    ReFloor selectRefloorById(Integer id);
    int insertRefloor(ReFloor value);
    int insertNonEmptyRefloor(ReFloor value);
    int deleteRefloorById(Integer id);
    int deleteRefloor(Assist assist);
    int updateRefloorById(ReFloor enti);
    int updateRefloor(ReFloor value, Assist assist);
    int updateNonEmptyRefloorById(ReFloor enti);
    int updateNonEmptyRefloor(ReFloor value, Assist assist);
}