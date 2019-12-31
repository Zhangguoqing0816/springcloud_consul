package com.guoqing.windows.consul.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 10:45
 */
@RestController
public class RestTempController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/call")
    public String call() {
//        ServiceInstance instance = loadBalancerClient.choose("serviceproducer");
//        System.out.println("服务地址：" + instance.getUri().toString());
//        System.out.println("服务名称：" + instance.getServiceId().toString());
        String string = restTemplate.getForObject("http://serviceproducer" + "/hello/sayHello", String.class);
        System.out.println(string);
        return string;
    }
}
