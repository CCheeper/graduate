package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Discuss;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiscussClientServiceFallbackFactory implements FallbackFactory<DiscussClientService> {
    @Override
    public DiscussClientService create(Throwable cause) {
        return new DiscussClientService() {
            @Override
            public Discuss get(int id) {
                return null;
            }

            @Override
            public List<Discuss> list() {
                return null;
            }

            @Override
            public Object add(Discuss discuss) {
                return null;
            }

            @Override
            public boolean delete(int id) {
                return false;
            }

            @Override
            public List<Discuss> findLimit(int fnum, int bnum) {
                return null;
            }

            @Override
            public Boolean update(Discuss discuss) {
                return null;
            }
        };
    }
}
