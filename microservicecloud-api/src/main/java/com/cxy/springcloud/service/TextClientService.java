package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = TextClientServiceFallbackFactory.class)
public interface TextClientService {
    @RequestMapping(value = "/text/get/{id}", method = RequestMethod.GET)
    public Text get(@PathVariable("id") int id);

    @RequestMapping(value = "/text/list", method = RequestMethod.GET)
    public List<Text> list();

    @RequestMapping(value = "/text/add", method = RequestMethod.POST)
    public Object add(@RequestBody Text text);

    @RequestMapping(value = "/text/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id);

    @RequestMapping(value = "/text/paging", method = RequestMethod.GET)
    public List<Text> findLimit(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum);
}
