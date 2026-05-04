package ch12.answer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Answer05 {
    static void main() throws IOException {
        FileWriter fileWriter = new FileWriter("temp/log.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        bufferedWriter.write(localDateTime.format(dateTimeFormatter));
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("로그 저장 완료");
    }
}