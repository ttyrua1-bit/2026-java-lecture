package ch12.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy01 {
    static void main() throws IOException {
        String fileName ="temp/video.mp4";
        long startTime =  System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy_video.mp4");
        byte [] bytes  =  fileInputStream.readAllBytes();
        fileOutputStream.write(bytes);
        fileInputStream.close();
        fileOutputStream.close();
        long endTime =  System.currentTimeMillis();
        System.out.println("time : "+(endTime-startTime)+"ms");

    }
}