package com.gx.center_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients
//@EntityScan("com.xuecheng.framework.domain.ucenter")//扫描实体类
//@ComponentScan(basePackages={"com.gx"})//扫描接口
//@ComponentScan(basePackages={"com.xuecheng.framework"})//扫描common下的所有类
@SpringBootApplication
public class CenterAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterAuthApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
