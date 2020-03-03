package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.entities.User;
import com.cxy.springcloud.service.TextClientService;
import com.cxy.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextController_Consumer {
    @Autowired
    private TextClientService service;

    @RequestMapping(value = "/consumer/text/get/{id}")
    public Text get(@PathVariable("id") int id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/text/list")
    public List<Text> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/text/add")
    public Object add(@RequestBody Text text) {
        return this.service.add(text);
    }

    //扯淡啊，返回值不能是object，必须是boolean
    @DeleteMapping(value = "/consumer/text/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.service.delete(id);
    }


    @RequestMapping(value = "/consumer/text/paging", method = RequestMethod.GET)
    public List<Text> paging(@RequestParam("fnum") int fnum,@RequestParam("bnum") int bnum) {
        return service.findLimit(fnum,bnum);
    }

    @RequestMapping(value = "/consumer/text/status/{id}", method = RequestMethod.GET)
    public String  status(@PathVariable("id") int id) {
        return this.service.status(id);
    }

    @RequestMapping(value = "/consumer/text/update" ,method = RequestMethod.POST)
    public Boolean update(@RequestBody Text text) {
        return service.update(text);
    }
}
