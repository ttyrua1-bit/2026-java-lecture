package ch12.files.answer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer02 {
    static void main() throws IOException {
        System.out.println("aaa");
        Path dir = Paths.get("temp");
        String fileName = "photo.jpg";
        String name = fileName.substring(0,fileName.lastIndexOf("."));
        String ext =  fileName.substring(fileName.lastIndexOf("."));

        Path target = dir.resolve(fileName);

        int count= 1;
        while(Files.exists(target)){
            target = dir.resolve(name+"("+count+")"+ext);
            count++;
        }
        Files.createFile(target);
        System.out.println("뭘까요");
        System.out.println("저장파일명 : "+target.getFileName());
    }
}