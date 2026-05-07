package ch12.files.answer;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Answer08 {

    static void main() throws IOException {
        //실행 주의 하지말기 삭제됨

        Path dir = Paths.get("C:\\Users\\tjoeunis205\\Downloads").toRealPath();
        LocalDateTime limit =  LocalDateTime.now().minusDays(7);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for(Path path:stream) {
            if(Files.isRegularFile(path)) {
                LocalDateTime modifiedTime = Files.getLastModifiedTime(path)
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime();
                if(modifiedTime.isBefore(limit)) {
                    Files.delete(path);
                    System.out.println(path.getFileName()+"삭제 완료");
                }
            }
        }
    }
}
