package com.cxy.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DiscussClientServiceFallbackFactory implements FallbackFactory<DiscussClientService> {
    @Override
    public DiscussClientService create(Throwable cause) {
        return null;
    }
}
