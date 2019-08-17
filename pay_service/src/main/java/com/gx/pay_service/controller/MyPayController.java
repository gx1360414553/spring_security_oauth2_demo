package com.gx.pay_service.controller;

import com.gx.pay_service.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class MyPayController {

    @Autowired
    PayService payService;

    @RequestMapping("/payOk")
    public String payOk(){
        payService.addOrder(1);
        return "ok";
    }
}
