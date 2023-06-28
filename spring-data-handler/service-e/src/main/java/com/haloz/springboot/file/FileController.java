package com.haloz.springboot.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class FileController {
    @Value("${spring.kafka.directory.path}")
    private String path;
    private static int fileId;

    public FileController() {
        fileId = 0;
    }

    public void writeFile(String json) throws Exception {
        if (fileId == 0) {
            clearDirectory();
        }
        FileOutputStream out = new FileOutputStream(path + fileId + ".json");
        out.write(json.getBytes());
        fileId++;
    }
    private void clearDirectory() {
        File[] files = new File(path).listFiles();
        assert files != null;
        for (File f : files) {
            f.delete();
        }
    }
}
