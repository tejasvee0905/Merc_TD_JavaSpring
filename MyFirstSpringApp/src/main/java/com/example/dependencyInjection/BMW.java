package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {
    @Autowired
    @Qualifier("V6")
    Engine engine;
    @Override
    public void spec() {
        System.out.println(engine.getType());
    }
}
