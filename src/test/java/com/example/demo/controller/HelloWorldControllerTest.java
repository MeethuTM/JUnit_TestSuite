package com.example.demo.controller;

import org.junit.Test;


import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {


    @Test
    public void getResponseTest() throws IOException {
        System.out.println("hello method in HelloController");

        String str = "working fine";
        assertEquals("working fine",str);

    }
}