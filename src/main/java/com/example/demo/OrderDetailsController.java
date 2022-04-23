package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderDetailsController {

    @GetMapping("/orderdetails")
    public List<Orderdetails> list() throws ClassNotFoundException, SQLException {
        List<Orderdetails> result = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "atul", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from orderdetails");
        while (rs.next()) {
            Orderdetails res = new Orderdetails();
            res.setOrdernumber(rs.getInt("orderNumber"));
            res.setProductcode(rs.getString("productCode"));
            res.setQuantityordered(rs.getInt("quantityOrdered"));
            res.setPriceeach(rs.getBigDecimal("priceEach"));
            res.setOrderlinenumber(rs.getInt("orderLineNumber"));
            result.add(res);
        }
        con.close();
        return result;
    }
}
