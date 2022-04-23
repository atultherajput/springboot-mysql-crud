package com.example.demo;

import java.math.BigDecimal;

public class Orderdetails {
    private Integer ordernumber;
    private String productcode;
    private Integer quantityordered;
    private BigDecimal priceeach;
    private Integer orderlinenumber;

    public Orderdetails() {
    }

    public Orderdetails(Integer ordernumber, String productcode, Integer quantityordered, BigDecimal priceeach, Integer orderlinenumber) {
        this.ordernumber = ordernumber;
        this.productcode = productcode;
        this.quantityordered = quantityordered;
        this.priceeach = priceeach;
        this.orderlinenumber = orderlinenumber;
    }

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

    public BigDecimal getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(BigDecimal priceeach) {
        this.priceeach = priceeach;
    }

    public Integer getOrderlinenumber() {
        return orderlinenumber;
    }

    public void setOrderlinenumber(Integer orderlinenumber) {
        this.orderlinenumber = orderlinenumber;
    }

    @Override
    public String toString() {
        return "Orderdetails{" +
                "ordernumber=" + ordernumber +
                ", productcode='" + productcode + '\'' +
                ", quantityordered=" + quantityordered +
                ", priceeach=" + priceeach +
                ", orderlinenumber=" + orderlinenumber +
                '}';
    }
}
