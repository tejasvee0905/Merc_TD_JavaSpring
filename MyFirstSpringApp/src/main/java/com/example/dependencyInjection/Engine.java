package com.example.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
    public String getType();
}
