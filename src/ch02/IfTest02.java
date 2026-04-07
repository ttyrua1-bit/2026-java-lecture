package ch02;

import java.util.Scanner;

public class IfTest02 {
    static void main() {
        //변수 2개 year score 둘다 int로 한다.
        //score가 60점 이상이면 pass인데
        //이때 4학년 이상은 70점 이상이면 합격

        Scanner scanner = new Scanner(System.in); //class == object(instance)

        System.out.println("학년을 입력하세요");
        int year = scanner.nextInt();

        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();

        if(score >= 60)
        {
            if(year >=4){
                if(score >= 70)
                {
                    System.out.println("합격");
                }
                else{
                    System.out.println("불합격");
                }
            }
            else{
                System.out.println("합격");
            }
        }
        else{
            System.out.println("불합격");
        }


    }
}
