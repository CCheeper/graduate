package com.cxy.springcloud.controller;

import java.util.List;

import com.cxy.springcloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cxy.springcloud.service.UserClientService;

@RestController
public class UserController_Consumer {
    @Autowired
    private UserClientService service;

    @RequestMapping(value = "/consumer/user/getbyusername")
    public User getbyusername(@RequestParam("username") String  username) {
        return this.service.getbyusername(username);
    }

    @RequestMapping(value = "/consumer/user/get/{id}")
    public User get(@PathVariable("id") int id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/user/list")
    public List<User> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/user/add")
    public Object add(@RequestBody User user) {
        return this.service.add(user);
    }

    //扯淡啊，返回值不能是object，必须是boolean
    @DeleteMapping(value = "/consumer/user/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.service.delete(id);
    }


    @RequestMapping(value = "/consumer/user/paging", method = RequestMethod.GET)
    public List<User> paging(@RequestParam("fnum") int fnum,@RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @RequestMapping(value = "/consumer/user/update" ,method = RequestMethod.PUT)
    public Boolean update(@RequestBody User user) {
        return service.update(user);
    }
}
