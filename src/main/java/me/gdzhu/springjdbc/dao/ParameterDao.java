package me.gdzhu.springjdbc.dao;

import me.gdzhu.springjdbc.model.Customer;

import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public interface ParameterDao {
    public void insertNamedParameter(Customer customer);
    public void insertBatchNamedParameter(final List<Customer> customers);
    public void insertBatchNamedParameter2(final List<Customer> customers);
    public void updateBatchNamedParameter(final List<Customer> customers);

}
