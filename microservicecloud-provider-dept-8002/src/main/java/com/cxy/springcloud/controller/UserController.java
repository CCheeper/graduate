package com.cxy.springcloud.controller;

import java.util.List;

import com.cxy.springcloud.entities.User;


import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cxy.springcloud.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping(value = "/user/add")
    public boolean add(@RequestBody User user) {

        return service.add(user);
    }

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public List<User> list() {
        return service.list();
    }

    @RequestMapping(value = "/user/paging", method = RequestMethod.GET)
    public List<User> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
        return service.findLimit(fnum, bnum);
    }

    @DeleteMapping(value = "/user/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return service.delete(id);
    }


}
