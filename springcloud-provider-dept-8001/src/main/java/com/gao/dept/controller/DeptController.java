package com.gao.dept.controller;


import com.gao.api.Dept;
import com.gao.api.ResponseModel;
import com.gao.api.ResponseUtil;
import com.gao.dept.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@Api("swaager測試接口")
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseModel add(@RequestBody Dept dept) {
        deptService.add (dept);
        return ResponseUtil.success ();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseModel get(@PathVariable("id") Long id) {
        return ResponseUtil.success (deptService.get (id));
    }

    @ApiOperation(value = "獲取全部信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseModel list() {
        return ResponseUtil.success (deptService.list ());
    }
    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public ResponseModel discovery() {
        List<String> services = discoveryClient.getServices ();
        System.out.println ("services==============" + services);
        List<ServiceInstance> instances = discoveryClient.getInstances ("SPRINGCLOUD-DEPT");
        instances.forEach (element -> System.out.println (instances.toString ()));
        return ResponseUtil.success (discoveryClient);
    }
}
