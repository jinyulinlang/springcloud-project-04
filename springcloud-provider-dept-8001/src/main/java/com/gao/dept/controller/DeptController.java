package com.gao.dept.controller;


import com.gao.api.Dept;
import com.gao.api.ResponseModel;
import com.gao.api.ResponseUtil;
import com.gao.dept.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Api("swaager測試接口")
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

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

}
