package com.example.dependencyInjection.car;

import com.example.dependencyInjection.Engine;
import org.springframework.stereotype.Component;

@Component("V8")
public class V8 implements Engine {
    @Override
    public String getType() {
        return "v8";
    }
}
