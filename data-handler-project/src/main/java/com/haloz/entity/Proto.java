package com.haloz.entity;

import com.google.gson.Gson;

import java.util.Arrays;

public class Proto {
    private int id;
    private byte[] array;

    public Proto(byte[] array) {
        this.array = array;
        id++;
    }

    public byte[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
