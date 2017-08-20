package me.gdzhu.springjdbc.dao.impl;

import me.gdzhu.springjdbc.dao.CustomerDAO;
import me.gdzhu.springjdbc.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class JdbcTemplateImpl implements CustomerDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql, new Object[]{customer.getCustId(), customer.getName(), customer.getAge()});
    }

    public Customer findByCustomerId(int custId) {
        return null;
    }

    public List<Customer> findAll() {
        return null;
    }

    public String findCustomerNameById(int custId) {
        return null;
    }
    public int findTotalCustomer() {
        return 0;
    }
}
