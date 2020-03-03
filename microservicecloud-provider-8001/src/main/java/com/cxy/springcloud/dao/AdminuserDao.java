package com.cxy.springcloud.dao;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.common.Assist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AdminuserDao{
    int getAdminuserRowCount(Assist assist);
    List<AdminUser> selectAdminuser(Assist assist);
    AdminUser selectAdminuserById(Integer id);
    int insertAdminuser(AdminUser value);
    int insertNonEmptyAdminuser(AdminUser value);
    int deleteAdminuserById(Integer id);
    int deleteAdminuser(Assist assist);
    int updateAdminuserById(AdminUser enti);
    int updateAdminuser(@Param("enti") AdminUser value, @Param("assist") Assist assist);
    int updateNonEmptyAdminuserById(AdminUser enti);
    int updateNonEmptyAdminuser(@Param("enti") AdminUser value, @Param("assist") Assist assist);
}