package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class xmlTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // For file path directly
        ApplicationContext context1 = new FileSystemXmlApplicationContext("file: /src/main/resources/beans.xml");
        Movie m = context.getBean(Movie.class);
        System.out.println(m.getTitle());

    }
}