package ch12.buffer;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile02 {
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream(BufferedConstant.FILE_NAME);
        byte[] buffer = new byte[BufferedConstant.BUFFER_SIZE];
        int bufferIndex = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < BufferedConstant.FILE_SIZE; i++) {
            //bufferIndex++;
            buffer[bufferIndex++] = 1;
            if (bufferIndex == BufferedConstant.BUFFER_SIZE) {
                fos.write(buffer);
                bufferIndex = 0;
            }
        }
        if (bufferIndex > 0) {
            fos.write(buffer, 0, bufferIndex);
        }
        fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + BufferedConstant.FILE_NAME);
        System.out.println("File Size : " + BufferedConstant.FILE_SIZE);
        System.out.println("파일생성까지 걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
