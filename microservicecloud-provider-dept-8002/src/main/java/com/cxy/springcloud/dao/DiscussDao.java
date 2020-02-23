package com.cxy.springcloud.dao;
import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Discuss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import	java.util.Map;
@Mapper
public interface DiscussDao {
    public boolean addDiscuss(Discuss user);

    public Discuss findById(int id);

    public List<Discuss> findAll();

    public boolean deleteDiscuss(int id);

    public List<Discuss> findLimit(@Param("fnum")int fnum, @Param("bnum") int bnum);
}
