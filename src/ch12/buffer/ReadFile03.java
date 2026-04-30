package ch12.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile03 {
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream(BufferedConstant.FILE_NAME);
        BufferedInputStream bis =  new BufferedInputStream(fis,BufferedConstant.BUFFER_SIZE);
        int fileSize = 0;
        int data;
        long startTime = System.currentTimeMillis();
        while((data=bis.read())!=-1) {
            fileSize++;
        }
        bis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + BufferedConstant.FILE_NAME);
        System.out.println("File Size : " + (fileSize/1024/1024)+"mb");
        System.out.println("파일읽는데 까지 걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
//멀티스레드 환경에서 동기화 때문에 좀 느려집니다.