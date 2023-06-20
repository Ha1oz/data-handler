package com.haloz;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;
import com.haloz.entity.Proto;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(
                    "F:\\Oleg\\Projects\\Java\\data-handler\\data-handler-project\\src\\main\\java\\com\\haloz\\testTxt.txt"
            );

           // ByteString bytes = ByteString.copyFrom(Files.readAllBytes(file.toPath()));
            byte[] byteArray = Files.readAllBytes(file.toPath());
            Proto proto = new Proto(byteArray);
            System.out.println("proto = " + proto);
            System.out.println("byteArray = " + Arrays.toString(byteArray));

            JsonObject jsonObject = new Gson().fromJson(proto.toString(), JsonObject.class);
            System.out.println("jsonObject = " + jsonObject);
            JsonElement jsonElement = jsonObject.get("array");
            System.out.println("jsonElement = " + jsonElement.getAsJsonArray());
            byte[] bytes = new byte[jsonElement.getAsJsonArray().size()];
            int i = 0;
            for (JsonElement j : jsonElement.getAsJsonArray()) {
                bytes[i] = j.getAsByte();
                i++;
            }
            ByteString byteString = ByteString.copyFrom(bytes);
            byteString.
            System.out.println("file = " + byteString);
            //System.out.println("file.length() = " + file.length());
        } catch (Exception e) {
            e.printStackTrace();
          }
    }
}