package com.example.demo;

import com.example.demo.controller.HelloWorldControllerTest;
import com.example.demo.service.HelloServiceWriteTest;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

///@Suite.SuiteClasses({ HelloServiceReadTest.class, HelloServiceWriteTest.class })
@RunWith(Suite.class)
@SelectPackages("com.example.demo")
@IncludeTags({"HelloServiceWrite","HelloWorldController"})
@Suite.SuiteClasses({HelloServiceWriteTest.class, HelloWorldControllerTest.class})
public class TestJUnitSuite {
}
