package com.cxy.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TextClientServiceFallbackFactory implements FallbackFactory<TextClientService> {
    @Override
    public TextClientService create(Throwable cause) {
        return null;
    }
}
