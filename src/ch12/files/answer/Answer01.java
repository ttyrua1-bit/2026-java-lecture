package ch12.files.answer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Answer01 {
    static void main() throws IOException {
        Path uploadFile = Path.of("temp/cat.jpg");
        String fileName = uploadFile.getFileName().toString();
        String name = fileName.substring(0,fileName.lastIndexOf("."));
        String ext = fileName.substring(fileName.lastIndexOf("."));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String newName = LocalDateTime.now().format(formatter);
        //resolve()는 자바가 운영체제에 따라서 경로를 해결해 준다.
        Path target =  uploadFile.getParent().resolve(name+"_"+newName+ext);
        //cat_202605061533333.jpg
        //C:\Users\tjoeunis205\Downloads
        //Path target =  Paths.get("temp/"+newName+ext); //
        Files.move(uploadFile,target);
        //Files.copy(uploadFile,target);
        System.out.println(target.getFileName());
        //System.out.println(fileName+" / "+ext);
    }
}
