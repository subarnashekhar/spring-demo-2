package com.techsmart.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-config.xml");

       HelloWorld helloWorld =  (HelloWorld)applicationContext.getBean("helloBean");

       helloWorld.sayHello();




    }
}
