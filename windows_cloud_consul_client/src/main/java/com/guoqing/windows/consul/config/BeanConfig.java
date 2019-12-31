package com.guoqing.windows.consul.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/31 11:28
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        System.out.println("加载1");
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //轮询
        return new RoundRobinRule();
    }
}
