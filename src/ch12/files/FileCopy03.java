package ch12.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy03 {
    static void main() throws IOException {
        long startTime =  System.currentTimeMillis();
        Path original = Path.of("temp/video.mp4");
        Path target = Path.of("temp/copy_video.mp4");
        Files.copy(original,target, StandardCopyOption.REPLACE_EXISTING);
        //자바로 읽어서 내보내기가 아니라 바로 운영체제의 copy기능을 이용
        long endTime =  System.currentTimeMillis();
        System.out.println("time : "+(endTime-startTime)+"ms");

    }
}
