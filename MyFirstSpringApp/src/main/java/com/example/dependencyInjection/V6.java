package com.example.dependencyInjection.car;

import com.example.dependencyInjection.Engine;
import org.springframework.stereotype.Component;

@Component("V6")
public class V6 implements Engine {
    @Override
    public String getType() {
        return "v6";
    }
}
