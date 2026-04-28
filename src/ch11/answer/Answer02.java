package ch11.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Answer02 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력하세요");
        List<Character> scores = new ArrayList<>();
        for(int i=0;i<6;i++) {
            String str = scanner.next();
            char ch = str.charAt(0);
            scores.add(ch);
        }
        double sum = 0;
        for(int i=0;i<scores.size();i++) {
            char ch = scores.get(i);
            double score = switch (ch) {
                case 'A' -> 4.0;
                case 'B' -> 3.0;
                case 'C' -> 2.0;
                case 'D' -> 1.0;
                default ->  0;
            };
            sum+=score;
        }
        System.out.println("당신의 평균은 "+(sum/scores.size()));
    }

}
