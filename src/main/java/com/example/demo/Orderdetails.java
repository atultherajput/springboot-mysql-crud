package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderdetails {
    private Integer ordernumber;
    private String productcode;
    private Integer quantityordered;
    private Double priceeach;
    private Integer orderlinenumber;

    public Orderdetails() {
    }

    public Orderdetails(Integer ordernumber, String productcode, Integer quantityordered, Double priceeach, Integer orderlinenumber) {
        this.ordernumber = ordernumber;
        this.productcode = productcode;
        this.quantityordered = quantityordered;
        this.priceeach = priceeach;
        this.orderlinenumber = orderlinenumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public Integer getQuantityordered() {
        return quantityordered;
    }

    public void setQuantityordered(Integer quantityordered) {
        this.quantityordered = quantityordered;
    }

    public Double getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(Double priceeach) {
        this.priceeach = priceeach;
    }

    public Integer getOrderlinenumber() {
        return orderlinenumber;
    }

    public void setOrderlinenumber(Integer orderlinenumber) {
        this.orderlinenumber = orderlinenumber;
    }
}
