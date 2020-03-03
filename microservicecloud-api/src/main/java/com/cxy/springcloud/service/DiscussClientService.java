package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Discuss;
import com.cxy.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DiscussClientServiceFallbackFactory.class)
public interface DiscussClientService {
    @RequestMapping(value = "/discuss/get/{id}", method = RequestMethod.GET)
    public Discuss get(@PathVariable("id") int id);

    @RequestMapping(value = "/discuss/list", method = RequestMethod.GET)
    public List<Discuss> list();

    @RequestMapping(value = "/discuss/add", method = RequestMethod.POST)
    public Object add(@RequestBody Discuss discuss);

    @RequestMapping(value = "/discuss/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id);

    @RequestMapping(value = "/discuss/paging", method = RequestMethod.GET)
    public List<Discuss> findLimit(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum);

    @RequestMapping(value = "/discuss/update" ,method = RequestMethod.POST)
    public Boolean update(@RequestBody Discuss discuss);
}
