package com.haloz.springboot;

import com.haloz.springboot.producer.ProtoFileChangesProducer;
import com.haloz.springboot.tracker.FileListener;
import com.haloz.springboot.tracker.FileMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    @Value("${spring.kafka.track.directory.name}")
    private String directory;
    @Autowired
    private ProtoFileChangesProducer protoFileChangesProducer;
    @Autowired
    private FileMonitor fileMonitor;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        fileMonitor.monitor(directory, new FileListener(protoFileChangesProducer));
        fileMonitor.start();
        //protoFileChangesProducer.sendProto(new ProtoFile(new File("F:\\Oleg\\protofile.proto")));
        //protoFileChangesProducer.sendProto(new ProtoFile(new File("F:\\Oleg\\Starset_-_Divisions.png")));
    }
}
