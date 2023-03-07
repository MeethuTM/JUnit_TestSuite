package com.example.demo.service;

import com.google.gson.*;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        jsonObject.put(lines, null);

      //  System.out.println("Write data is..." + lines);
        String s1 = String.valueOf(lines);
        s1 = s1.replaceAll(",  \\s", "");
        file.write(s1.toString());
        file.close();
        System.out.println("Writted data sucesssfully..\n" + s1.trim());

    }

    public void addFiled() throws IOException {

        FileReader reader = new FileReader("src/main/resources/input.txt");
        JsonParser parser = new JsonParser();
        JsonObject jsonObj = (JsonObject) parser.parse(reader);
        JsonArray inputJson = (JsonArray) jsonObj.get("opportunities");
        reader.close();
        JsonObject devices = null;

        for (int i = 0; i < inputJson.size(); i++) {
            devices = (JsonObject) inputJson.get(i);
            devices.addProperty("name", "Meethu Muralidharan");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
        writer.write(jsonObj.toString());
        writer.close();
        System.out.println("Added new field...." +jsonObj);

    }
}
