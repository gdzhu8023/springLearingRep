package me.gdzhu.javaconfig;

import me.gdzhu.javaconfig.bo.HelloWorld;
import me.gdzhu.javaconfig.bo.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gdzhu on 2017/8/25.
 *  使用 @Configuration 注释告诉 Spring，这是核心的 Spring 配置文件，并通过 @Bean 定义 bean。
 */
@Configuration
public class AppConfig {
    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
