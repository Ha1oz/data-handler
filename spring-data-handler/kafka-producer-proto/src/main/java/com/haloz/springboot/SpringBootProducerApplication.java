package com.haloz.springboot;

import com.haloz.springboot.payload.ProtoFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }
    @Autowired
    private ProtoFileChangesProducer protoFileChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        protoFileChangesProducer.sendProto(new ProtoFile(new File("F:\\Oleg\\protofile.proto")));
        //protoFileChangesProducer.sendProto(new ProtoFile(new File("F:\\Oleg\\Starset_-_Divisions.png")));
    }
}
