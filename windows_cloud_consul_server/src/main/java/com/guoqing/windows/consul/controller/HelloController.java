package com.guoqing.windows.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 9:41
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String hello() {
        return "Hello windows_cloud_consul_server";
    }

    @RequestMapping("/sayGuoQing")
    public String sayGuoQing() {
        return "Hello windows_cloud_consul_server sayGuoQing";
    }
}
