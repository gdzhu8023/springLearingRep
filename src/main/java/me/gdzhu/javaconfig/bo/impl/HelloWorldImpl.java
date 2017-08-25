package me.gdzhu.javaconfig.bo.impl;

import me.gdzhu.javaconfig.bo.HelloWorld;

/**
 * Created by gdzhu on 2017/8/25.
 */
public class HelloWorldImpl implements HelloWorld {
    public void printHelloWorld(String msg) {
        System.out.println("Hello : " + msg);
    }
}
