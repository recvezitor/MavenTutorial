package com.dimas.child2;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }
}
