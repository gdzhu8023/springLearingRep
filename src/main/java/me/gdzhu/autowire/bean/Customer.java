package me.gdzhu.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gdzhu on 2017/8/25.
 */
public class Customer {
    private Person person;

    private int type;
    private String action;

    public Customer() {
    }

    @Autowired
    public Customer(Person person) {
        System.out.println("autowiring by constructor");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }


    public void setPerson(Person person) {
        System.out.println("autowiring by type");
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + "]";
    }
}
