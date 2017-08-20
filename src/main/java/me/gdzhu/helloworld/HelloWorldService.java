package me.gdzhu.helloworld;

/**
 * Created by gdzhu on 2017/8/9.
 */
public class HelloWorldService {
    private HelloWorld helloWorld;

    public HelloWorldService() {

    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }
}
