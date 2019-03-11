package com.maskleo.spring.springflux;

import java.util.Map;
import java.util.Properties;

public class TestB extends TestA {

    static {
        System.out.println("s b");
    }

    {
        System.out.println("b");
    }

    public TestB() {
        System.out.println("c b");
    }

    public static void main(String[] args) {
        TestB b = new TestB();
        Properties p = System.getProperties();
        for (Map.Entry entry : p.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
