package ch12.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain04 {
    static void main() throws IOException {
        FileOutputStream fos =  new FileOutputStream("temp/hello.txt"); // 외부 파일에 쓸 수 있다
        byte [] input = {65,66,67};                                          // network으로 쓸 수 있다
        fos.write(input);
        fos.close();
        FileInputStream fis = new FileInputStream("temp/hello.txt");
        byte [] readBytes = fis.readAllBytes(); //0~buffer.length
        System.out.println(Arrays.toString(readBytes));  //
        fis.close();
    }
}
