package com.gx.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/addOrder/{id}")
    public Map<String,String> addOrder(@PathVariable("id")Integer id){
        System.out.printf("......................id=%s",id);
        System.out.println("");
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
