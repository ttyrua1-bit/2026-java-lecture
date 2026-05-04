package ch12.answer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Answer03 {
    static void main() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("temp/numbers.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); //보조 스트림
        byte[] buffer = new byte[1024];
        int len;
        int data;
        int sum = 0;
        int num = 0;
        while ((data = bufferedInputStream.read()) != -1) {
            char ch = (char) data;
            System.out.println(ch);
            if (ch == '\n') {
                sum += num;
                num = 0;
            } else if (ch != '\r') {
                num = num * 10 + (ch - '0');
            }
        }
        sum += num;
        bufferedInputStream.close();
        System.out.println("합계 : " + sum);
    }
}
