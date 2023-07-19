package com.haloz.springboot.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class ClientConverter {
    Gson gson = new Gson();
    public <T> T getClientJson(String json, Class<T> to) {
        return gson.fromJson(json, to);
    }
}
