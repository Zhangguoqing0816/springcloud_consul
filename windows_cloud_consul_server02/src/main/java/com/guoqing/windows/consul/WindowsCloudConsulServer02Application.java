package com.guoqing.windows.consul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class WindowsCloudConsulServer02Application {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = SpringApplication.run(WindowsCloudConsulServer02Application.class, args).getEnvironment();
        log.info(" \n SwaggerUI :  http://localhost:{}/swagger-ui.html \n" +
                        " controller :  http://localhost:{}/hello/sayHello",
                environment.getProperty("server.port"),
                environment.getProperty("server.port"));
    }

}
