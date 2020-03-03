package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.AdminUser;

import com.cxy.springcloud.common.Assist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.AdminuserService;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminuserService service;

    @RequestMapping(value = "/adminuser/add", method = RequestMethod.POST)
    public int add(@RequestBody AdminUser user) {
        return service.insertAdminuser(user);
    }

    @RequestMapping(value = "/adminuser/get/{id}", method = RequestMethod.GET)
    public AdminUser get(@PathVariable("id") int id) {
        return service.selectAdminuserById(id);
    }

    @RequestMapping(value = "/adminuser/list", method = RequestMethod.GET)
    public List<AdminUser> list(@RequestParam("username") String username, @RequestParam("currentPage") int currentPage, @RequestParam("size") int size) {

        Assist assist = new Assist();
        assist.setRowSize(size);
        assist.setStartRow(currentPage);
        return service.selectAdminuser(assist);
    }

//    @RequestMapping(value = "/adminuser/paging", method = RequestMethod.GET)
//    public List<AdminUser> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
//        return com.cxy.springcloud.service.findLimit(fnum, bnum);
//    }

    @DeleteMapping(value = "/adminuser/delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.deleteAdminuserById(id);
    }

    @RequestMapping(value = "/adminuser/update", method = RequestMethod.POST)
    public int update(@RequestBody AdminUser adminUser) {
        return service.updateAdminuser(adminUser,null);
    }

}
