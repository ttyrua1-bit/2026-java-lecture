package ch12.files;

import java.io.File;
import java.io.IOException;

public class OldFileMain {
    static void main() throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");
        System.out.println("File exists : "+file.exists());
        System.out.println("Directory exists : "+directory.exists());
        //1. 파일을 만들 수 있다.
        boolean  created = file.createNewFile();
        System.out.println("File created : "+created);
        //2. 디렉토리를 만들 수 있다.
        boolean dirCreadted =  directory.mkdir();
        System.out.println("Directory created : "+dirCreadted);

        //3. 파일 삭제
        //boolean deleted = file.delete();
        //System.out.println("File deleted : "+deleted);

        //4. 파일인지 확인
        System.out.println("is file : "+file.isFile());

        //5. 디렉토리인지 확인
        System.out.println("is directory : "+directory.isDirectory());

        //6. 파일의 이름 확인
        System.out.println("File name : "+file.getName());

        //7. 파일의 크기 반환
        File img = new File("temp/copy.jpg");
        System.out.println("File size : "+img.length()+"bytes");

        //8. 파일 이름을 바꾸고 전송
        File newFile = new File("temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("File renamed : "+renamed);


    }
}
