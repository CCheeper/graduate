package com.cxy.springcloud.dao;

import com.cxy.springcloud.entities.ReFloor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RefloorDao {
    public boolean addFloor(ReFloor floor);

    public ReFloor findById(int id);

    public List<ReFloor> findAll();

    public boolean deleteFloor(int id);

    public List<ReFloor> findLimit(@Param("fnum")int fnum, @Param("bnum") int bnum);
}
