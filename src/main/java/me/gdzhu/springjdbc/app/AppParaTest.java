package me.gdzhu.springjdbc.app;

import me.gdzhu.springjdbc.dao.ParameterDao;
import me.gdzhu.springjdbc.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class AppParaTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ParameterDao parameterDao = (ParameterDao) context.getBean("ParameterDao");

//        Customer customer = new Customer(4,"nio",23);
//        parameterDao.insertNamedParameter(customer);

        Customer customer1 = new Customer(11, "testFF1",24);
        Customer customer3 = new Customer(12, "testFF2",25);
        Customer customer2 = new Customer(13, "testFF3",26);

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        //parameterDao.insertBatchNamedParameter(customers);
        //parameterDao.insertBatchNamedParameter2(customers);
        parameterDao.updateBatchNamedParameter(customers);
    }
}
