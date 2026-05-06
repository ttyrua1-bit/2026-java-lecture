package ch12.files.answer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer06 {
    static void main() throws IOException {
        Path dir = Paths.get("temp/images");
        int count=0;
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for(Path path:stream) {
            if(Files.isRegularFile(path)) {
                String name = path.getFileName().toString().toLowerCase();
                if(name.endsWith(".jpg")||name.endsWith(".gif")||name.endsWith(".png")) {
                    count++;
                }
            }
        }
        stream.close();
        System.out.println("이미지 파일 갯수 :  "+count);
    }
}
