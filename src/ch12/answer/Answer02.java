package ch12.answer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Answer02 {
    static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("temp/diary.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //byte를 글자로 바꿔서 입력 조금 불편해서 나온게 Reader/Writer
        //Writer,Reader
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            bufferedOutputStream.write((input+"\n").getBytes(StandardCharsets.UTF_8));
        }
        bufferedOutputStream.close();
        scanner.close();
        System.out.println("일기 저장완료");
    }
}
