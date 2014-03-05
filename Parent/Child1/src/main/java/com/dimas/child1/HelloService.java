package com.dimas.child1;

import com.dimas.common.HelloCommonService;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        HelloCommonService common = new HelloCommonService();
        common.sayHello();
        return "Hello world!";
    }
}
