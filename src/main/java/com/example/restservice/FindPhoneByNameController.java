package com.example.restservice;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindPhoneByNameController {

	@GetMapping("/find_phone_by_name")
	public JSONObject find_phone_by_name(@RequestParam(value = "fio", defaultValue = "") String fio) {
		FindPhoneByName phones = new FindPhoneByName(fio);
		try {
			return phones.GetPhonesByNameList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject empty = new JSONObject();
		return empty;
	}
}