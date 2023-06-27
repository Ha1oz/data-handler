package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.haloz.springboot.entities.ClientCpu;
import com.haloz.springboot.service.ClientConverter;
import com.haloz.springboot.utils.GetData;

import java.util.UUID;

public class SendingObject {
    private UUID globalId;
    private final ClientCpu clientCpu;
    private final String receiver;

    public<T extends ClientCpu> SendingObject (String json, Class<T> clientFormat) {
        String globalIdStr = GetData.json(json, "globalId");
        try {
            this.globalId = UUID.fromString(globalIdStr);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        ClientConverter clientConverter = new ClientConverter();
        String dataJsonString = GetData.jsonOneDepth(json, "data");

        this.clientCpu = clientConverter.getClientJson(dataJsonString, clientFormat);

         this.receiver = GetData.json(json, "receiver");
    }

    public UUID getGlobalId() {
        return globalId;
    }

    public ClientCpu getClientCpu() {
        return clientCpu;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
