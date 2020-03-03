package com.cxy.springcloud.service;
import java.util.List;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.common.Assist;

public interface AdminuserService{
    long getAdminuserRowCount(Assist assist);
    List<AdminUser> selectAdminuser(Assist assist);
    AdminUser selectAdminuserById(Integer id);
    int insertAdminuser(AdminUser value);
    int insertNonEmptyAdminuser(AdminUser value);
    int deleteAdminuserById(Integer id);
    int deleteAdminuser(Assist assist);
    int updateAdminuserById(AdminUser enti);
    int updateAdminuser(AdminUser value, Assist assist);
    int updateNonEmptyAdminuserById(AdminUser enti);
    int updateNonEmptyAdminuser(AdminUser value, Assist assist);
}