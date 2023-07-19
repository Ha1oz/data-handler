package com.haloz.springboot.entities;

import com.google.gson.Gson;
import com.haloz.springboot.entities.interfaces.ClientCpu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientCpuFullImpl implements ClientCpu {
    private String name;
    private Integer cores, threads;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
