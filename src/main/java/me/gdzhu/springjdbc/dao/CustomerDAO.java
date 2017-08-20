package me.gdzhu.springjdbc.dao;

import me.gdzhu.springjdbc.model.Customer;

import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public interface CustomerDAO {
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
    public List<Customer> findAll();
    public String findCustomerNameById(int custId);

    /**
     * 从数据库中查询行的总数。
     * @return
     */
    public int findTotalCustomer();
}
