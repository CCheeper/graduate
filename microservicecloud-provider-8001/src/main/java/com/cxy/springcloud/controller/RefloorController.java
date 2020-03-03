package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.ReFloor;

import com.cxy.springcloud.common.Assist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.RefloorService;

import java.util.List;

@RestController
public class RefloorController {
    @Autowired
    private RefloorService service;

    @RequestMapping(value = "/refloor/add", method = RequestMethod.POST)
    public int add(@RequestBody ReFloor floor) {
        return service.insertRefloor(floor);
    }

    @RequestMapping(value = "/refloor/get/{id}", method = RequestMethod.GET)
    public ReFloor get(@PathVariable("id") int id) {
        return service.selectRefloorById(id);
    }

    @RequestMapping(value = "/refloor/list", method = RequestMethod.GET)
    public List<ReFloor> list(@RequestParam("currentPage") int currentPage,@RequestParam("size")int size) {
        Assist assist =new Assist();
        assist.setRowSize(size);
        assist.setStartRow(currentPage);
        return service.selectRefloor(assist);
    }



    @DeleteMapping(value = "/refloor/delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.deleteRefloorById(id);
    }

    @RequestMapping(value = "/refloor/update" ,method = RequestMethod.POST)
    public int update(@RequestBody ReFloor reFloor) {
        return service.updateNonEmptyRefloor(reFloor,null);
    }
}
