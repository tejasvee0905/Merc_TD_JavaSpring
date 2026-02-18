package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car c1 = context.getBean("Car1",Car.class);
        Car c2 = context.getBean("Car2",Car.class);
        Car c3 = context.getBean("Car3",Car.class);

        c1.setTitle("Porsche");
        c2.setTitle("BMW");
        c3.setTitle("Lambo");

        System.out.println(c1.getTitle());
        System.out.println(c2.getTitle());
        System.out.println(c3.getTitle());
    }
}
