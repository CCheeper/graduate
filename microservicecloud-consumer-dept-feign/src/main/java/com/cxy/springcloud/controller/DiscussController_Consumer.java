package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.Discuss;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.DiscussClientService;
import com.cxy.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscussController_Consumer {
    @Autowired
    private DiscussClientService service;

    @RequestMapping(value = "/consumer/discuss/get/{id}")
    public Discuss get(@PathVariable("id") int id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/discuss/list")
    public List<Discuss> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/discuss/add")
    public Object add(@RequestBody Discuss discuss) {
        return this.service.add(discuss);
    }

    //扯淡啊，返回值不能是object，必须是boolean
    @DeleteMapping(value = "/consumer/discuss/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.service.delete(id);
    }


    @RequestMapping(value = "/consumer/discuss/paging", method = RequestMethod.GET)
    public List<Discuss> paging(@RequestParam("fnum") int fnum,@RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }
}
