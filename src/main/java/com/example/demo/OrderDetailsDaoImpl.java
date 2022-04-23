package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class OrderDetailsDaoImpl extends JdbcDaoSupport implements OrderDetailsDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<Orderdetails> findAll() {

        String sql = "SELECT * FROM orderdetails";

        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Orderdetails> result = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            Orderdetails res = new Orderdetails();
            res.setOrdernumber((Integer) row.get("orderNumber"));
            res.setProductcode((String) row.get("productCode"));
            res.setQuantityordered((Integer) row.get("quantityOrdered"));
            res.setPriceeach((BigDecimal) row.get("priceEach"));
            res.setOrderlinenumber((Integer) row.get("orderLineNumber"));
            result.add(res);
        }

        return result;
    }
}
