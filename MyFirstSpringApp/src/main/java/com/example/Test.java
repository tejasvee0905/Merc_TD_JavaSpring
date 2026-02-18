package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(Movie.class)
//        Movie m = new Movie();
        Movie m1 = context.getBean("Movie1",Movie.class);
        m1.setTitle("LEO");
        System.out.println(m1.getTitle());

        Movie m2 = context.getBean("Movie2",Movie.class);
        m2.setTitle("Jeela Top Laage Lu");
        System.out.println(m2.getTitle());

        Book b1 = context.getBean(Book.class);
        b1.setTitle("Champak");
        System.out.println(b1.getTitle());
    }
}
