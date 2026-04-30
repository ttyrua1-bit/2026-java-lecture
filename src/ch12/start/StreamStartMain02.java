package ch12.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain02 {
    static void main() throws IOException {
        FileOutputStream fos =  new FileOutputStream("temp/hello.txt",true);
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();
        FileInputStream fis =  new FileInputStream("temp/hello.txt");
        int data;
        while((data = fis.read()) != -1){
            System.out.println(data);
        }
        fis.close();
    }
}
