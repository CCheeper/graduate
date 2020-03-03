package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Text;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TextClientServiceFallbackFactory implements FallbackFactory<TextClientService> {
    @Override
    public TextClientService create(Throwable cause) {
        return new TextClientService() {
            @Override
            public Text get(int id) {
                return null;
            }

            @Override
            public List<Text> list() {
                return null;
            }

            @Override
            public Object add(Text text) {
                return null;
            }

            @Override
            public boolean delete(int id) {
                return false;
            }

            @Override
            public List<Text> findLimit(int fnum, int bnum) {
                return null;
            }

            @Override
            public String status(int id) {
                return null;
            }

            @Override
            public Boolean update(Text text) {
                return null;
            }
        };
    }
}
