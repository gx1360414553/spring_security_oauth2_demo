package com.gx.pay_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(value = "order-service")
public interface OrderClient {

    @GetMapping("/order/addOrder/{id}")
    public Map<String,String> addOrder(@PathVariable("id")Integer id);
}
