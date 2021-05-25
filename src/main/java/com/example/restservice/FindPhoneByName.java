package com.example.restservice;

import com.example.restservice.Helpers;
import org.springframework.core.io.ClassPathResource;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Stream;

public class FindPhoneByName {

	private final String fio;
	private static final String filename = "static/phones_by_fio.csv";

	public FindPhoneByName(String fio) {
		this.fio = fio;
	}

	public JSONObject GetPhonesByNameList() throws Exception {
		InputStream resource = new ClassPathResource(filename).getInputStream();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource))) {
			Stream<String> file = reader.lines();
			Map<String, String> all_phones = Helpers.readAll(file);
			return Helpers.filterByFio(all_phones, fio);
		}

	}
}