package com.cxy.springcloud.controller;

import com.cxy.springcloud.common.Result;
import com.cxy.springcloud.dao.ESDao;
import com.cxy.springcloud.entity.ESText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ESController {
    @Autowired
    ESDao esDao;
    @RequestMapping(value = "/essearch", method = RequestMethod.POST)
    public Result<Boolean> add() {
        esDao.save(new ESText().setId(3).setText("hello").setTitle("world"));
        return Result.instance("200","成功",true);
    }
}
