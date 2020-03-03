package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = AdminUserClientServiceFallbackFactory.class)
public interface AdminUserClientService {
    @RequestMapping(value = "/adminuser/get/{id}", method = RequestMethod.GET)
    public AdminUser get(@PathVariable("id") int id);

    @RequestMapping(value = "/adminuser/list", method = RequestMethod.GET)
    public List<AdminUser> list();

    @RequestMapping(value = "/adminuser/add", method = RequestMethod.POST)
    public Object add(@RequestBody AdminUser user);

    @RequestMapping(value = "/adminuser/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id);

    @RequestMapping(value = "/adminuser/paging", method = RequestMethod.GET)
    public List<AdminUser> findLimit(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum);

    @RequestMapping(value = "/adminuser/update" ,method = RequestMethod.POST)
    public Boolean update(@RequestBody AdminUser adminUser);
}
