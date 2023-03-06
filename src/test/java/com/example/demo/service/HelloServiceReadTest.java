package com.example.demo.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceReadTest {
    @Test
    public void read() {
        System.out.println("Read method in HelloService");

        String str = "Read file is working fine";
        assertEquals("Read file is working fine",str);
        //return str;
    }

}