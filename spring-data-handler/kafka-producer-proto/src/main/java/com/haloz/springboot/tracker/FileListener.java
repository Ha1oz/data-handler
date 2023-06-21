package com.haloz.springboot.tracker;

import com.haloz.springboot.producer.ProtoFileChangesProducer;
import com.haloz.springboot.payload.SendingObject;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.io.IOException;

public class FileListener extends FileAlterationListenerAdaptor {
    private final ProtoFileChangesProducer protoFileChangesProducer;
    public FileListener(ProtoFileChangesProducer protoFileChangesProducer) {
        this.protoFileChangesProducer = protoFileChangesProducer;
    }

    @Override
    public void onStart(FileAlterationObserver observer) {
        super.onStart(observer);
        System.out.println("onStart");
    }

//    @Override
//    public void onDirectoryCreate(File directory) {
//        System.out.println("create：" + directory.getAbsolutePath());
//    }
//
//    @Override
//    public void onDirectoryChange(File directory) {
//        System.out.println("modify：" + directory.getAbsolutePath());
//    }
//
//    @Override
//    public void onDirectoryDelete(File directory) {
//        System.out.println("delete：" + directory.getAbsolutePath());
//    }

    @Override
    public void onFileCreate(File file) {
        String compressedPath = file.getAbsolutePath();
        System.out.println("create：" + compressedPath);
        sendFileToKafka(file);
//        if (file.canRead()) {
//            // TODO: Чтение или перезагрузка содержимого файлов
//            System.out.println("file changes, processing");
//        }
    }

    @Override
    public void onFileChange(File file) {
        String compressedPath = file.getAbsolutePath();
        System.out.println("modify：" + compressedPath);
        sendFileToKafka(file);
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("delete：" + file.getAbsolutePath());
    }

    @Override
    public void onStop(FileAlterationObserver observer) {
        super.onStop(observer);
        System.out.println("onStop");
    }
    private void sendFileToKafka(File file){
        try {
            protoFileChangesProducer.sendProto(new SendingObject(file));
            if (file.delete()) {
                System.out.println("deleted from local");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
