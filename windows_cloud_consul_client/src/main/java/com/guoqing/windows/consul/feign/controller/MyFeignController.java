package com.guoqing.windows.consul.feign.controller;

import com.guoqing.windows.consul.feign.service.MyFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 11:19
 */
@RestController
@RequestMapping("myfeign")
public class MyFeignController {

    @Autowired
    private MyFeignService myFeignService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        String hello = myFeignService.hello();
        return hello;
    }

    @RequestMapping("/sayGuoQing")
    public String sayGuoQing() {
        return myFeignService.sayGuoQing();
    }

}
