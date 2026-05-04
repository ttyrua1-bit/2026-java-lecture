package ch12.answer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Answer01 {
    static void main() throws IOException {
        //파일은 .txt,.hwp,jpg,mp3,mp4
        FileInputStream fileInputStream = new FileInputStream("temp/min.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy.jpg");
        byte [] buffer = new byte[1024];
        int len;
        while((len=fileInputStream.read(buffer))!=-1) {
//            String str =  new String(buffer,0,len);
//            System.out.print(str);
            fileOutputStream.write(buffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("file이 복사되었습니다.");
    }

}
