package com.guoqing.windows.consul.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 9:57
 */

@RestController
public class TestConsulController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     * @return
     */
    @RequestMapping("/getServices")
    public Object services(){
        return discoveryClient.getInstances("service-producer");
    }

    /**
     * 从所有服务中选择一个服务(轮询)
     */
    @RequestMapping("discover")
    public Object discover(){
        return loadBalancerClient.choose("service-producer").getUri().toString();
    }


}
