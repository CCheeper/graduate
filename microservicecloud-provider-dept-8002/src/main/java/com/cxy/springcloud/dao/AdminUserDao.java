package com.cxy.springcloud.dao;

import com.cxy.springcloud.entities.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminUserDao {
    public boolean addAdminUser(AdminUser user);

    public AdminUser findById(int id);

    public List<AdminUser> findAll();

    public boolean deleteAdminUser(int id);

    public List<AdminUser> findLimit(@Param("fnum")int fnum, @Param("bnum") int bnum);
}
