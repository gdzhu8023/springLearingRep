package me.gdzhu.autowire;

import me.gdzhu.autowire.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gdzhu on 2017/8/25.
 */
public class app {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire/assembly.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getPerson().getName());

    }
}
