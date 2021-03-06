package me.gdzhu.springjdbc.app;

import me.gdzhu.springjdbc.dao.CustomerDAO;
import me.gdzhu.springjdbc.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;
import java.util.List;

/**
 * Created by gdzhu on 2017/8/20.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        //插入一条数据
//        Customer customer = new Customer(3,"jett",23);
//        customerDAO.insert(customer);
        //查询一条数据
        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
        System.out.println("--------------");
        //查询一个集合
        List<Customer> customers = customerDAO.findAll();
        for (Customer customerTemp : customers) {
            System.out.println(customerTemp);
        }
        System.out.println("--------------");
        //查询一个字符串
        String nameTemp = customerDAO.findCustomerNameById(1);
        System.out.println(nameTemp);
        System.out.println("--------------");
        //查询数量count
        int totalNum = customerDAO.findTotalCustomer();
        System.out.println(totalNum);

    }
}
