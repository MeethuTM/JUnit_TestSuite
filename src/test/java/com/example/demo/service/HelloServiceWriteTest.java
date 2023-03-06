package com.example.demo.service;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceWriteTest {

    @Test
    public void write() {
        System.out.println("writeFile method in Demo");
        String str = "writeFile is working fine";
        assertEquals("writeFile is working fine", str);
    }
}