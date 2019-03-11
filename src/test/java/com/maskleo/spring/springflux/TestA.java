package com.maskleo.spring.springflux;

public class TestA {

    static {
        System.out.println("s a");
    }

    {
        System.out.println("a");
    }

    public TestA(){
        System.out.println("c a");
    }
}
