package com.cxy.springcloud.dao;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Text;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TextDao {
    public boolean addText(Text user);

    public Text findById(int id);

    public List<Text> findAll();

    public boolean deleteText(int id);

    public List<Text> findLimit(@Param("fnum")int fnum, @Param("bnum") int bnum);
}
