package com.dimas.child1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright 2009-2014. NxSystems Inc.
 * PROPRIETARY/CONFIDENTIAL.
 * <p/>
 * Created: 10.03.14 23:10
 *
 * @author Dmitry Borovoy
 */
public class StupidClass {
    private final Logger l = LoggerFactory.getLogger(getClass());

    public void doSomething() {
        boolean a = false;
        if (a) {
            l.info("a={}", a);
        } else {
            l.info("a={}", a);
        }


    }
}
