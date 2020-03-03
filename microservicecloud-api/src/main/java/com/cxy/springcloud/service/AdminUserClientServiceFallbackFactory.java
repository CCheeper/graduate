package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.AdminUser;
import feign.hystrix.FallbackFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdminUserClientServiceFallbackFactory implements FallbackFactory<AdminUserClientService> {
    @Override
    public AdminUserClientService create(Throwable cause) {
        return new AdminUserClientService() {
            @Override
            public AdminUser get(int id) {
                return null;
            }

            @Override
            public List<AdminUser> list() {
                return null;
            }

            @Override
            public Object add(AdminUser user) {
                return null;
            }

            @Override
            public boolean delete(int id) {
                return false;
            }

            @Override
            public List<AdminUser> findLimit(int fnum, int bnum) {
                return null;
            }

            @Override
            public Boolean update(AdminUser adminUser) {
                return null;
            }
        };
    }
}
