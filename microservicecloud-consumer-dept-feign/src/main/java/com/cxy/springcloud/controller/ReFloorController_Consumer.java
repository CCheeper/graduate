package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.ReFloor;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.ReFloorClientservice;
import com.cxy.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReFloorController_Consumer {
    @Autowired
    private ReFloorClientservice service;

    @RequestMapping(value = "/consumer/refloor/get/{id}")
    public ReFloor get(@PathVariable("id") int id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/refloor/list")
    public List<ReFloor> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/refloor/add")
    public Object add(@RequestBody ReFloor reFloor) {
        return this.service.add(reFloor);
    }

    //扯淡啊，返回值不能是object，必须是boolean
    @DeleteMapping(value = "/consumer/refloor/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.service.delete(id);
    }


    @RequestMapping(value = "/consumer/refloor/paging", method = RequestMethod.GET)
    public List<ReFloor> paging(@RequestParam("fnum") int fnum,@RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }
}
