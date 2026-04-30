package ch12.buffer;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile02 {
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream(BufferedConstant.FILE_NAME);
        byte [] buffer =  new byte[BufferedConstant.BUFFER_SIZE];
        int fileSize = 0;
        int size;
        long startTime = System.currentTimeMillis();
        while((size=fis.read(buffer))!=-1) {
            fileSize+=size;
        }

        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + BufferedConstant.FILE_NAME);
        System.out.println("File Size : " + (fileSize/1024/1024)+"mb");
        System.out.println("파일읽는데 까지 걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
