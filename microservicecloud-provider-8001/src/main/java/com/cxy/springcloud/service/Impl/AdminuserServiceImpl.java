package com.cxy.springcloud.service.Impl;
import java.util.List;

import com.cxy.springcloud.entities.AdminUser;

import com.cxy.springcloud.common.Assist;
import com.cxy.springcloud.dao.AdminuserDao;
import com.cxy.springcloud.service.AdminuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminuserServiceImpl implements AdminuserService {
    @Autowired
    private AdminuserDao adminuserDao;
    @Override
    public long getAdminuserRowCount(Assist assist){
        return adminuserDao.getAdminuserRowCount(assist);
    }
    @Override
    public List<AdminUser> selectAdminuser(Assist assist){
        return adminuserDao.selectAdminuser(assist);
    }
    @Override
    public AdminUser selectAdminuserById(Integer id){
        return adminuserDao.selectAdminuserById(id);
    }
    @Override
    public int insertAdminuser(AdminUser value){
        return adminuserDao.insertAdminuser(value);
    }
    @Override
    public int insertNonEmptyAdminuser(AdminUser value){
        return adminuserDao.insertNonEmptyAdminuser(value);
    }
    @Override
    public int deleteAdminuserById(Integer id){
        return adminuserDao.deleteAdminuserById(id);
    }
    @Override
    public int deleteAdminuser(Assist assist){
        return adminuserDao.deleteAdminuser(assist);
    }
    @Override
    public int updateAdminuserById(AdminUser enti){
        return adminuserDao.updateAdminuserById(enti);
    }
    @Override
    public int updateAdminuser(AdminUser value, Assist assist){
        return adminuserDao.updateAdminuser(value,assist);
    }
    @Override
    public int updateNonEmptyAdminuserById(AdminUser enti){
        return adminuserDao.updateNonEmptyAdminuserById(enti);
    }
    @Override
    public int updateNonEmptyAdminuser(AdminUser value, Assist assist){
        return adminuserDao.updateNonEmptyAdminuser(value,assist);
    }

    public AdminuserDao getAdminuserDao() {
        return this.adminuserDao;
    }

    public void setAdminuserDao(AdminuserDao adminuserDao) {
        this.adminuserDao = adminuserDao;
    }

}