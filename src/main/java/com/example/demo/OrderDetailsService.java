package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository repo;

    public List<Orderdetails> listAll() {
        return repo.findAll();
    }

    public void save(Orderdetails orderDetails) {
        repo.save(orderDetails);
    }

    public Orderdetails get(Integer orderNumber) {
        return repo.findById(orderNumber).get();
    }

    public void delete(Integer orderNumber) {
        repo.deleteById(orderNumber);
    }
}
