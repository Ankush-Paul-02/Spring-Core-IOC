package com.paul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// IOC - Inversion of control
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Developer developer = (Developer) context.getBean("developer");
        developer.code();
        System.out.println(developer.age = 21);

        // Singleton beans
        Developer developer2 = (Developer) context.getBean("developer");
        developer2.code();
        System.out.println(developer2.age);

    }
}
