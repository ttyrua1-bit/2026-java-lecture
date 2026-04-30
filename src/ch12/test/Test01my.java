package ch12.test;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Test01my {
    static void main() {
        try(FileInputStream fis = new FileInputStream("dog.jpg");
            FileOutputStream fos = new FileOutputStream("copy.jpg")){

            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer))!= -1){
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("파일 복사 완료!");

        } catch (IOException e){
            e.printStackTrace();



        }




    }

}
