package ch02;

public class IfTest {
    static void main() {
        int num = 78786;     //하나의 문이다.
        if(num%2 == 1){
            System.out.println("홀수입니다.");
        }
        else System.out.println("짝수입니다."); // 한줄일때는 중괄호생략가능


        int score = 82;
        if(score > 90){
            System.out.println("A");
        }
        if(score>80){
            System.out.println("B");
        }
        if(score>70){
            System.out.println("C");
        }
        if(score>60){
            System.out.println("D");
        }
    }
}
