package ch12.files.answer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer03 {
    static void main() throws IOException {
        Path dir = Paths.get("temp");
        Path imageDir = Paths.get("temp/images");
        Files.createDirectories(imageDir);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for(Path file:stream) {
            String fileName= file.getFileName().toString();
            if(fileName.endsWith(".jpg")) {
                Path target = imageDir.resolve(file.getFileName());
                Files.move(file,target);
            }
        }
        stream.close();
    }
}