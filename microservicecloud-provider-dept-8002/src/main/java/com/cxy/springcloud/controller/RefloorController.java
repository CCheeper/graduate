package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.ReFloor;
import com.cxy.springcloud.service.RefloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RefloorController {
    @Autowired
    private RefloorService service;

    @RequestMapping(value = "/refloor/add", method = RequestMethod.POST)
    public boolean add(@RequestBody ReFloor floor) {
        return service.add(floor);
    }

    @RequestMapping(value = "/refloor/get/{id}", method = RequestMethod.GET)
    public ReFloor get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @RequestMapping(value = "/refloor/list", method = RequestMethod.GET)
    public List<ReFloor> list() {
        return service.list();
    }

    @RequestMapping(value = "/refloor/paging", method = RequestMethod.GET)
    public List<ReFloor> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @DeleteMapping(value = "/refloor/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
