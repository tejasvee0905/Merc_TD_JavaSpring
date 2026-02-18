package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Merc implements Car {
    @Autowired
    @Qualifier("V6")
    Engine engine1;

    @Autowired
    @Qualifier("V8")
    Engine engine2;

    @Override
    public void spec() {
        System.out.println("Engine 1: " + engine1.getType());
        System.out.println("Engine 2: " + engine2.getType());
    }
}
