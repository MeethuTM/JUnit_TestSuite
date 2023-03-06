package com.example.demo;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


@Suite
@SelectPackages("com.example.demo")

class DemoApplicationTests {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJUnitSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
