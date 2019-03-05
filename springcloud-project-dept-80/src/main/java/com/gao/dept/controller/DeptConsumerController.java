package com.gao.dept.controller;

import com.gao.api.Dept;
import com.gao.api.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/")
public class DeptConsumerController {
    private static final String REST_URL_PREFIX = "http://localhost:8001";
    /**
     * 使用 restTemplate 访问restful接口非常简单粗暴无脑<br/>
     * (url, requestMap,ResponseBean.class) <br/>
     * 这三个参数分别代表REST请求地址，请求参数，HTTP 响应<br/>
     * 转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 新增一条信息
     *
     * @param dept
     * @return
     */
    @RequestMapping("/dept/add")
    public ResponseModel add(Dept dept) {
        return restTemplate.postForObject (REST_URL_PREFIX.concat ("/dept/add"), dept, ResponseModel.class);
    }


    /**
     * 查找一条信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/dept/get/{id}")
    public ResponseModel getById(@PathVariable Long id) {
        return restTemplate.getForObject (REST_URL_PREFIX.concat ("/dept/get").concat ("/" + id), ResponseModel.class);
    }

    /**
     * 查找list接口
     *
     * @return
     */
    @RequestMapping("/dept/list")
    public ResponseModel list() {
        return restTemplate.getForObject (REST_URL_PREFIX.concat ("/dept/list"), ResponseModel.class);
    }

    /**
     * 查找list接口
     *
     * @return
     */
    @RequestMapping("/dept/discovery")
    public ResponseModel discovery() {
        return restTemplate.getForObject (REST_URL_PREFIX.concat ("/dept/discovery"), ResponseModel.class);
    }


}
