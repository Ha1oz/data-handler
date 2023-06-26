package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.haloz.springboot.proto.Product;

public class ProtoCPU {
    private final String receiverId;
    private final String name;
    private final Integer cores;
    private final Integer threads;

    public ProtoCPU(byte[] bytes) {
        Product.CPU cpu = null;
        try {
            cpu = Product.CPU.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            //Throw object in "troubles"
        }
        if (cpu == null) {
            throw new NullPointerException(); // custom?
        }
        receiverId = cpu.getReceiverId();
        name = cpu.getName();
        cores = cpu.getNumberCores();
        threads = cpu.getNumberThreads();
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getName() {
        return name;
    }

    public Integer getCores() {
        return cores;
    }

    public Integer getThreads() {
        return threads;
    }
    public JsonObject getJson() {
        JsonObject res = new JsonObject();
        return new Gson().fromJson(this.toString(), JsonObject.class);
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
