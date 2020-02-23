package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.AdminUserClientService;
import com.cxy.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AdminController_Consumer {
    @Autowired
    private AdminUserClientService service;

    @RequestMapping(value = "/consumer/adminuser/get/{id}")
    public AdminUser get(@PathVariable("id") int id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/adminuser/list")
    public List<AdminUser> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/adminuser/add")
    public Object add(@RequestBody AdminUser user) {
        return this.service.add(user);
    }

    //扯淡啊，返回值不能是object，必须是boolean
    @DeleteMapping(value = "/consumer/adminuser/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.service.delete(id);
    }


    @RequestMapping(value = "/consumer/adminuser/paging", method = RequestMethod.GET)
    public List<AdminUser> paging(@RequestParam("fnum") int fnum,@RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }
}
