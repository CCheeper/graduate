package com.cxy.springcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.cxy.springcloud.common.Result;
import com.cxy.springcloud.entities.User;

import com.cxy.springcloud.common.Assist;

import org.eclipse.jetty.client.api.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    //添加
    @PostMapping(value = "/user/add")
    public int add(@RequestBody JSONObject jsonObject) {
        User user = jsonObject.toJavaObject(User.class);
        return service.insertUser(user);
    }

    //通过id获取用户
    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id) {
        return service.selectUserById(id);
    }

    //获取所有用户
    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public Result list(@RequestParam("searchInfo")String searchInfo, @RequestParam("current")int current, @RequestParam("size")int size) {
//        JSONObject jsonObject =new JSONObject();
        Assist assist =new Assist();
        assist.setRowSize(size);
        assist.setStartRow(current);
        assist.setRequires(Assist.and_like("username","%"+searchInfo+"%"));
//        jsonObject.put("code",20000);
//        jsonObject.put("data", service.selectUser(assist));

        return Result.instance("20000","",service.selectUser(assist));
    }

//    //分页
//    @RequestMapping(value = "/user/paging", method = RequestMethod.GET)
//    public JSONObject paging(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum) {
//        JSONObject jsonObject =new JSONObject();
//        jsonObject.put("code",20000);
//        jsonObject.put("data", com.cxy.springcloud.service.findLimit(fnum,bnum));
//        return jsonObject;
//    }

    //删除
    @DeleteMapping(value = "/user/delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.deleteUserById(id);
    }

    //更新操作
    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    public int update(@RequestBody User user) {
        return service.updateUser(user,null);
    }

    //按用户名模糊查询
    @RequestMapping(value = "/user/getlikeusername", method = RequestMethod.PUT)
    public List<User> getlikeusername(@RequestParam("username") String  username) {
        return null;
    }

    @RequestMapping(value = "/user/count", method = RequestMethod.GET)
    public JSONObject count() {
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("code",20000);
        jsonObject.put("data", service.getUserRowCount(null));
        return jsonObject;
    }
}
