package com.example.restservice;

import org.json.simple.JSONObject;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Helpers {

    public static Map<String, String> readAll(Stream<String> file) {

        Map<String, String> resultMap = file.map(line -> line.split(","))
                .collect(Collectors.toMap(line -> line[0], line -> line[1]));

        file.close();

        return resultMap;
    }

    public static JSONObject filterByFio(Map<String, String> all_phones, String fio) {
        Map<String, String> result = all_phones.entrySet().stream().filter(map -> map.getKey().indexOf(fio) != -1)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        JSONObject json = new JSONObject(result);
        return json;
    }

    public static void err(Exception ex) {
        System.out.println("EXCEPTION ENCOUNTERED: " + ex);
    }
}