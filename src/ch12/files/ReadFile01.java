package ch12.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFile01 {
    static void main() throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("==== write string ====");
        System.out.println(writeString);

        Path path = Path.of("temp/hello02.txt");
        //1. 파일 쓰기
        Files.writeString(path,writeString, StandardCharsets.UTF_8);

        //2. 파일 읽기
        String readString =  Files.readString(path,StandardCharsets.UTF_8);
        System.out.println("==== read string ====");
        System.out.println(readString);

        List<String> lines = Files.readAllLines(path,StandardCharsets.UTF_8);
        for(int i=0;i<lines.size();i++){
            System.out.println((i+1)+":"+lines.get(i));
        }
    }


}
