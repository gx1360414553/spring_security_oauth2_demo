package com.gx.springcloud_zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy//此工程是一个zuul网关
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZullApplication.class, args);
    }

}
