package com.cxy.springcloud.service;

import java.util.List;

import com.cxy.springcloud.entities.Dept;
import com.cxy.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * @author zzyy
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
 * <p>
 * 新建
 * <p>
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @date 2018年4月21日
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {
    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id);

    @RequestMapping(value = "/user/getbyusername", method = RequestMethod.GET)
    public User getbyusername(@RequestParam("username") String  username);

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public List<User> list();

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public Object add(@RequestBody User user);

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id);

    @RequestMapping(value = "/user/paging", method = RequestMethod.GET)
    public List<User> findLimit(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum);

    @RequestMapping(value = "/user/update" ,method = RequestMethod.PUT)
    public Boolean update(@RequestBody User user);
    }

