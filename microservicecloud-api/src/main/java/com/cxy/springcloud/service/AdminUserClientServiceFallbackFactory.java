package com.cxy.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

@Component
public class AdminUserClientServiceFallbackFactory implements FallbackFactory<AdminUserClientService> {
    @Override
    public AdminUserClientService create(Throwable cause) {
        return null;
    }
}
