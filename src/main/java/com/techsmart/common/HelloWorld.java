package com.techsmart.common;

public class HelloWorld {

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public HelloWorld() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sayHello(){
        System.out.println("Hello" + name);
    }
}
