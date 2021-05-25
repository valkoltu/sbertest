package com.example.restservice;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPhonesController {

    @GetMapping("/get_phones")
    public JSONObject get_phones() {
        GetPhones phones = new GetPhones();
        try {
            return phones.GetPhonesList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject empty = new JSONObject();
        return empty;
    }
}