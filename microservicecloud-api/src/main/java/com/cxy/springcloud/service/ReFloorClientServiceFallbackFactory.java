package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.ReFloor;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReFloorClientServiceFallbackFactory implements FallbackFactory<ReFloorClientservice> {
    @Override
    public ReFloorClientservice create(Throwable cause) {
        return new ReFloorClientservice() {
            @Override
            public ReFloor get(int id) {
                return null;
            }

            @Override
            public List<ReFloor> list() {
                return null;
            }

            @Override
            public Object add(ReFloor reFloor) {
                return null;
            }

            @Override
            public boolean delete(int id) {
                return false;
            }

            @Override
            public List<ReFloor> findLimit(int fnum, int bnum) {
                return null;
            }

            @Override
            public Boolean update(ReFloor reFloor) {
                return null;
            }
        };
    }
}
