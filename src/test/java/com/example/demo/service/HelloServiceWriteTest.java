package com.example.demo.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.applicationinsights.core.dependencies.apachecommons.io.FileUtils;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.json.JSONException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceWriteTest {

    //String inJson;
    @Mock
    private HelloService helloService;
    @Test
    public void read() throws IOException {
//        System.out.println("Read method in HelloService");
//        String str = "Read file is working fine";
//        assertEquals("Read file is working fine",str);
        String inputMessage = FileUtils.readFileToString(new File("src/main/resources/input.txt"));
        Object actualData=null;
        List<String> messages=new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        actualData = mapper.readValue(inputMessage, Map.class);

        Assertions.assertNotNull(actualData);

    }
    @Test
    public void write() throws Exception{
        String inputMessage = FileUtils.readFileToString(new File("src/main/resources/output.txt"));
        System.out.println("Write test message"+inputMessage);

        Assertions.assertNotNull(inputMessage);
    }
    @Test
    public void addField() throws IOException, JSONException {

        String inputMessage = FileUtils.readFileToString(new File("src/main/resources/output.txt"));
        String s = "Meethu Muralidharan";

        assert(inputMessage).contains(s);
    }


}