package com.dimas.common;

import com.dimas.util.DBAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloCommonService {
    private final Logger l = LoggerFactory.getLogger(getClass());
    public String sayHello() {
        DBAccess dbAccess = new DBAccess();
        dbAccess.setName("QQQQ");
        l.info(dbAccess.getName());
        return "Hello world!";
    }
}
