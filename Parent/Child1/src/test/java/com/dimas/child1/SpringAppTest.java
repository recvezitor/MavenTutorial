package com.dimas.child1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTest {

    private final Logger l = LoggerFactory.getLogger(getClass());

    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHello() {
        assertEquals("Hello world!", helloService.sayHello());
        l.info("Unit. Child1");
    }
}
