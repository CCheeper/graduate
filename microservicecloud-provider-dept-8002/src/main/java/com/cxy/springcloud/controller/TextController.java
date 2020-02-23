package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.service.AdminUserService;
import com.cxy.springcloud.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextController {
    @Autowired
    private TextService service;

    @RequestMapping(value = "/text/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Text text) {
        return service.add(text);
    }

    @RequestMapping(value = "/text/get/{id}", method = RequestMethod.GET)
    public Text get(@PathVariable("id") int id) {
        return service.get(id);
    }

    @RequestMapping(value = "/text/list", method = RequestMethod.GET)
    public List<Text> list() {
        return service.list();
    }

    @RequestMapping(value = "/text/paging", method = RequestMethod.GET)
    public List<Text> paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @DeleteMapping(value = "/text/delete/{id}")
    public Boolean delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
