package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.ReFloor;
import com.cxy.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = ReFloorClientServiceFallbackFactory.class)
public interface ReFloorClientservice {
    @RequestMapping(value = "/refloor/get/{id}", method = RequestMethod.GET)
    public ReFloor get(@PathVariable("id") int id);

    @RequestMapping(value = "/refloor/list", method = RequestMethod.GET)
    public List<ReFloor> list();

    @RequestMapping(value = "/refloor/add", method = RequestMethod.POST)
    public Object add(@RequestBody ReFloor reFloor);

    @RequestMapping(value = "/refloor/delete/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable("id") int id);

    @RequestMapping(value = "/refloor/paging", method = RequestMethod.GET)
    public List<ReFloor> findLimit(@RequestParam("fnum") int fnum, @RequestParam("bnum") int bnum);
}
