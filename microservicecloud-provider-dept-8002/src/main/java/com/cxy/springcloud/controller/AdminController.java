package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.AdminUserService;
import com.cxy.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AdminController {
    @Autowired
    private AdminUserService service;

    @RequestMapping(value = "/adminuser/add", method = RequestMethod.POST)
    public boolean add(@RequestBody AdminUser user) {
        return service.add(user);
    }

    @RequestMapping(value = "/adminuser/get/{id}", method = RequestMethod.GET)
    public AdminUser get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @RequestMapping(value = "/adminuser/list", method = RequestMethod.GET)
    public List<AdminUser> list() {
        return service.list();
    }

    @RequestMapping(value = "/adminuser/paging", method = RequestMethod.GET)
    public List<AdminUser> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @DeleteMapping(value = "/adminuser/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

}
