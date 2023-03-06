package com.example.demo.service;

import com.google.gson.*;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONObject;

@Service
public class HelloService {
    public JSONObject jsonObject = new JSONObject();

    List<String> lines;
    String s1;
    public String readFile() throws IOException {
        Path readFilePath = Paths.get("src/main/resources/input.txt");
        lines = Files.readAllLines(readFilePath);
        System.out.println(lines);
        return lines.toString();
    }

    public void writeFile() throws IOException {
        FileWriter file = new FileWriter("src/main/resources/output.txt");
	    jsonObject.put(lines,null);

        System.out.println("Write data is..."+lines);
	    String s1 = String.valueOf(lines);
        s1 = s1.replaceAll(",  \\s", "");
		file.write(s1.toString());
        file.close();
        System.out.println("Pushed data sucesssfully..\n"+s1.trim());

    }

//    public void addFiled() throws IOException {
//
//        List<String> l1 = new ArrayList<>();
//        l1.add("{name:meethu muralidharan}");
//
//        List<String> strList = lines;
//
//        List<String> merge = new ArrayList<>();
//
//        Iterator i = lines.iterator();
//        while (i.hasNext()) {
//            merge.add((String) i.next());
//        }
//        i=l1.iterator();
//        while (i.hasNext()) {
//            merge.add((String) i.next());
//        }
//
//
//        String s2 = String.valueOf(merge);
//        s2 = s2.replaceAll(",  \\s", "");
//        System.out.println("The list is.."+s2);



}
