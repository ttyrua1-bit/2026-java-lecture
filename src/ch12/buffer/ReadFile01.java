package ch12.buffer;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile01 {
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream(BufferedConstant.FILE_NAME);
        int fileSize = 0;
        int data;
        long startTime = System.currentTimeMillis();
        while((data = fis.read())!=-1) {
            fileSize++;
        }
        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + BufferedConstant.FILE_NAME);
        System.out.println("File Size : " + (fileSize/1024/1024)+"mb");
        System.out.println("파일읽는데 까지 걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
