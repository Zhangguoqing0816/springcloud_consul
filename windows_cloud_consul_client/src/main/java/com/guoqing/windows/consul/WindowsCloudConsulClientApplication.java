package com.guoqing.windows.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
@EnableFeignClients
public class WindowsCloudConsulClientApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(WindowsCloudConsulClientApplication.class, args).getEnvironment();
        log.info(" \n SwaggerUI :  http://localhost:{}/swagger-ui.html \n " +
                        "controller Addr : http://localhost:{}/hello",
                environment.getProperty("server.port"),
                environment.getProperty("server.port"));
    }

}
