package com.cxy.springcloud.service;

import java.util.List;

import com.cxy.springcloud.entities.User;
import org.springframework.stereotype.Component;


import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public User get(int id) {
                return new User().setUsername("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
            }

            @Override
            public List<User> list() {
                return null;
            }

            @Override
            public Object add(User user) {
                return null;
            }



            @Override
            public boolean delete(int id) {
                return false;
            }

            @Override
            public List<User> findLimit(int fnum, int bnum) {
                return null;
            }
        };
    }
}
