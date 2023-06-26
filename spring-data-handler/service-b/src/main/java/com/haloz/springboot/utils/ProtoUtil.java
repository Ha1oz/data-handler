package com.haloz.springboot.utils;

import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
/**
 * Author @espresso stackoverflow.
 * Sample use:
 *      Model.Person reqProto = ProtoUtil.toProto(reqJson, Model.Person.getDefaultInstance());
 Model.Person resProto = personSvc.update(reqProto); // service layer call
 final String resJson = ProtoUtil.toJson(resProto);
 **/
public class ProtoUtil {
    public static <T extends Message> String toJson(T obj){
        try{
            return JsonFormat.printer().print(obj);
        }catch(Exception e){
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }
    public static <T extends MessageOrBuilder> T toProto(String protoJsonStr, T message){
        try{
            Message.Builder builder = message.getDefaultInstanceForType().toBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr,builder);
            T out = (T) builder.build();
            return out;
        }catch(Exception e){
            throw new RuntimeException("Error converting Json to proto", e);
        }
    }

}