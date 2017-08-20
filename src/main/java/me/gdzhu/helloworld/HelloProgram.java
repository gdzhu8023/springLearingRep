package me.gdzhu.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gdzhu on 2017/8/9.
 */
public class HelloProgram {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hellospring/beans.xml");
        HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
        HelloWorld hw = service.getHelloWorld();
        hw.sayHello();

        ApplicationContext context1 = new ClassPathXmlApplicationContext(new String[]{"hellospring/beans.xml"});
        HelloWorldService service1= (HelloWorldService) context1.getBean("helloWorldService");
        HelloWorld helloWorld = service1.getHelloWorld();
        helloWorld.sayHello();
    }
}
