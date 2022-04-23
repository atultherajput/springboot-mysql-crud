package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

    @Autowired
    OrderDetailsDao orderDetailsDao;
    public List<Orderdetails> listAll() {
        return orderDetailsDao.findAll();
    }
}
