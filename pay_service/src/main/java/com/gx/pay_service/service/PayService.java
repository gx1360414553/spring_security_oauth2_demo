package com.gx.pay_service.service;

import com.gx.pay_service.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PayService {

    @Autowired
    OrderClient orderClient;

    public void addOrder(Integer id) {
        Map<String, String> stringStringMap = orderClient.addOrder(1);
        System.out.println(stringStringMap.get("status"));
    }
}
