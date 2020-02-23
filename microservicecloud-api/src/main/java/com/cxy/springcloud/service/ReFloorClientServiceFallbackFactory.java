package com.cxy.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ReFloorClientServiceFallbackFactory implements FallbackFactory<ReFloorClientservice> {
    @Override
    public ReFloorClientservice create(Throwable cause) {
        return null;
    }
}
