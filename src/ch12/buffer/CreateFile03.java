package ch12.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile03 {
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream(BufferedConstant.FILE_NAME);
        byte[] buffer = new byte[BufferedConstant.BUFFER_SIZE];
        BufferedOutputStream bos =  new BufferedOutputStream(fos,BufferedConstant.BUFFER_SIZE); // 보조 스트림

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < BufferedConstant.FILE_SIZE; i++) {
            bos.write(1);

        }
        bos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + BufferedConstant.FILE_NAME);
        System.out.println("File Size : " + BufferedConstant.FILE_SIZE);
        System.out.println("파일생성까지 걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
