package com.example.restservice;

import com.example.restservice.Helpers;
import org.springframework.core.io.ClassPathResource;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class GetPhones {

  private static final String filename = "static/phones_by_fio.csv";

  public GetPhones() {
  }

  public JSONObject GetPhonesList() throws Exception {
    InputStream resource = new ClassPathResource(filename).getInputStream();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource))) {
      Stream<String> file = reader.lines();
      JSONObject json = new JSONObject(Helpers.readAll(file));
      return json;
    }
  }

}
