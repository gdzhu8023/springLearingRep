package me.gdzhu.springjdbc.dao.impl;

import me.gdzhu.springjdbc.dao.CustomerDAO;
import me.gdzhu.springjdbc.dao.rowmap.CustomerRowMapper;
import me.gdzhu.springjdbc.model.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class JdbcDaoSupportImpl extends JdbcDaoSupport implements CustomerDAO {
    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql,
                new Object[]{customer.getCustId(), customer.getName(), customer.getAge()
                });
    }

    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

//        Customer customer = (Customer)getJdbcTemplate().queryForObject(
//                sql, new Object[] { custId }, new CustomerRowMapper());
        Customer customer = (Customer)getJdbcTemplate().queryForObject(
                sql, new Object[] { custId },new BeanPropertyRowMapper(Customer.class));
        return customer;
    }

    public List<Customer> findAll() {
        String sql = "SELECT * FROM CUSTOMER";

        List<Customer> customers  = getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper(Customer.class));

        return customers;
    }

    public String findCustomerNameById(int custId) {
        String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";

        String name = (String)getJdbcTemplate().queryForObject(
                sql, new Object[] { custId }, String.class);

        return name;
    }

    public int findTotalCustomer() {
        String sql = "SELECT COUNT(*) FROM CUSTOMER";
        int total = getJdbcTemplate().queryForInt(sql);
        return total;
    }
}
