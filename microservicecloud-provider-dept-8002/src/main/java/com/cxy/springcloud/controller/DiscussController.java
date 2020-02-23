package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Discuss;
import com.cxy.springcloud.service.AdminUserService;
import com.cxy.springcloud.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscussController {
    @Autowired
    private DiscussService service;

    @RequestMapping(value = "/discuss/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Discuss user) {
        return service.add(user);
    }

    @RequestMapping(value = "/discuss/get/{id}", method = RequestMethod.GET)
    public Discuss get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @RequestMapping(value = "/discuss/list", method = RequestMethod.GET)
    public List<Discuss> list() {
        return service.list();
    }

    @RequestMapping(value = "/discuss/paging", method = RequestMethod.GET)
    public List<Discuss> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @DeleteMapping(value = "/discuss/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
