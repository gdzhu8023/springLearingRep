package me.gdzhu.springjdbc.dao.impl;

import me.gdzhu.springjdbc.dao.ParameterDao;
import me.gdzhu.springjdbc.model.Customer;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class ParameterDaoImpl extends NamedParameterJdbcDaoSupport implements ParameterDao {

    public void insertNamedParameter(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("custId", customer.getCustId());
        parameters.put("name", customer.getName());
        parameters.put("age", customer.getAge());

        getNamedParameterJdbcTemplate().update(sql, parameters);
    }

    public void insertBatchNamedParameter(final List<Customer> customers) {
        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";

        List<SqlParameterSource> parameters = new ArrayList<SqlParameterSource>();
        for (Customer cust : customers) {
            parameters.add(new BeanPropertySqlParameterSource(cust));
        }
        getNamedParameterJdbcTemplate().batchUpdate(sql,
                parameters.toArray(new SqlParameterSource[0]));
    }

    public void insertBatchNamedParameter2(List<Customer> customers) {
        SqlParameterSource[] params =
                SqlParameterSourceUtils.createBatch(customers.toArray());

        getNamedParameterJdbcTemplate().batchUpdate(
                "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)",
                params);
    }

    public void updateBatchNamedParameter(final List<Customer> customers){
        String sql = "UPDATE CUSTOMER SET NAME=:name,AGE=:age where CUST_ID=:custId" ;
        SqlParameterSource[] params =
                SqlParameterSourceUtils.createBatch(customers.toArray());
        getNamedParameterJdbcTemplate().batchUpdate(sql,params);
    }




}
