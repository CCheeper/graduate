package com.cxy.springcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.cxy.springcloud.common.Result;
import com.cxy.springcloud.entities.User;

import com.cxy.springcloud.common.Assist;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cxy.springcloud.service.TextService;
import com.cxy.springcloud.service.UserService;

import java.util.List;

@RestController
public class SystemController {
    @Autowired
    public UserService userService;
    @Autowired
    public TextService textService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public Result<JSONObject> login(@RequestBody JSONObject usr) {
        JSONObject jsonObject = new JSONObject();
        String username = String.valueOf(usr.getString("username"));
        String password = String.valueOf(usr.getString("password"));
        Assist assist = new Assist();
        assist.setRequires(Assist.and_eq("username", username));
        if (userService.selectUser(assist).isEmpty()) {
            return Result.instance("40000", "此用户不存在");
        }
        if (userService.selectUser(assist).get(0).getPassword().equals(password)) {
            return Result.instance("20000", "登陆成功");
        } else {
            return Result.instance("40000", "用户名或密码不正确");
        }
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public Result register(@RequestBody JSONObject usr) {
        User user = usr.toJavaObject(User.class);
        Assist assist = new Assist();
        assist.setRequires(Assist.and_eq("username", user.getUsername()));
        if (userService.selectUser(assist).isEmpty()) {
            userService.insertUser(user);
            return Result.instance("20000", "用户注册成功");
        } else {
            return Result.instance("40000", "此用户已存在");
        }
    }

    //提取用户信息
    @RequestMapping(value = "/user/info", method = RequestMethod.POST)
    public Result register(@RequestParam("token") String token) {
        Assist assist = new Assist();
        assist.setRequires(Assist.and_eq("token", token));
        if(userService.selectUser(assist).isEmpty()){
            return Result.instance("40000","查询失败");
        }
        List<User> users = userService.selectUser(assist);
        return Result.instance("20000","查询成功",users);
    }
}
