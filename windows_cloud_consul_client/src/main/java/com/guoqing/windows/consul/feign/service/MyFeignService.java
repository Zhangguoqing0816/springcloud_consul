package com.guoqing.windows.consul.feign.service;

import com.guoqing.windows.consul.feign.fallback.MyFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 11:01
 */
@FeignClient(value = "serviceproducer", fallback = MyFeignServiceFallback.class)
@RequestMapping("/hello")
public interface MyFeignService {

    @RequestMapping("/sayHello")
    public String hello();

    @RequestMapping("/sayGuoQing")
    public String sayGuoQing();
}
