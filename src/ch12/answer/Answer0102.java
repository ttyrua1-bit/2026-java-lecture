package ch12.answer;

import java.io.*;

public class Answer0102 {

    static void main() throws IOException {
        //파일은 .txt,.hwp,jpg,mp3,mp4
        byte [] buffer = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream("temp/jun.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,1024*4);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,1024*4);

        int len;
        while((len=bufferedInputStream.read())!=-1) {
            bufferedOutputStream.write(buffer);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        System.out.println("file이 복사되었습니다.");
    }

}
