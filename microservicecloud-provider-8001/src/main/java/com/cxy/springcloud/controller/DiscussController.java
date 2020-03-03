package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.Discuss;

import com.cxy.springcloud.common.Assist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.DiscussService;

import java.util.List;

@RestController
public class DiscussController {
    @Autowired
    private DiscussService service;

    @RequestMapping(value = "/discuss/add", method = RequestMethod.POST)
    public int add(@RequestBody Discuss user) {
        return service.insertDiscuss(user);
    }

    @RequestMapping(value = "/discuss/get/{id}", method = RequestMethod.GET)
    public Discuss get(@PathVariable("id") int id) {
        return service.selectDiscussById(id);
    }

    @RequestMapping(value = "/discuss/list", method = RequestMethod.GET)
    public List<Discuss> list(@RequestParam("currentPage") int currentPage,@RequestParam("size")int size) {
        Assist assist =new Assist();
        assist.setRowSize(size);
        assist.setStartRow(currentPage);
        return service.selectDiscuss(assist);
    }

//    @RequestMapping(value = "/discuss/paging", method = RequestMethod.GET)
//    public List<Discuss> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
//        return com.cxy.springcloud.service.findLimit(fnum,bnum);
//    }

    @DeleteMapping(value = "/discuss/delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.deleteDiscussById(id);
    }

    @RequestMapping(value = "/discuss/update" ,method = RequestMethod.POST)
    public int update(@RequestBody Discuss discuss) {
        return service.updateDiscuss(discuss,null);
    }
}
