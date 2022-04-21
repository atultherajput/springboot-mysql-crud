package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderDetailsController {
    @Autowired
    private OrderDetailsService service;

    @GetMapping("/orderdetails")
    public List<Orderdetails> list() {
        return service.listAll();
    }
}
