package com.cxy.springcloud.controller;

import com.cxy.springcloud.entities.Text;

import com.cxy.springcloud.common.Assist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.TextService;

import java.util.List;

@RestController
public class TextController {
    @Autowired
    private TextService service;

    @RequestMapping(value = "/text/add", method = RequestMethod.POST)
    public int add(@RequestBody Text text) {
        return service.insertText(text);
    }

    @RequestMapping(value = "/text/get/{id}", method = RequestMethod.GET)
    public Text get(@PathVariable("id") int id) {
        return service.selectTextById(id);
    }

    @RequestMapping(value = "/text/list", method = RequestMethod.GET)
    public List<Text> list(@RequestParam("currentPage") int currentPage,@RequestParam("size")int size) {
        Assist assist =new Assist();
        assist.setRowSize(size);
        assist.setStartRow(currentPage);
        return service.selectText(assist);
    }


    @DeleteMapping(value = "/text/delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.deleteTextById(id);
    }

    @RequestMapping(value = "/text/update" ,method = RequestMethod.POST)
    public int update(@RequestBody Text text) {
        return service.updateText(text,null);
    }
}
