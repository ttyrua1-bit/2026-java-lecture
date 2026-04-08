package ch03;

public class ForTest {
    static void main() {
        int sum = 0;
        for(int i = 0;i<=100;i+=2){   //i는 블록 스코프 중괄호안에서만 접근가능

            //System.out.println("hello World"+ i);
        }
        //System.out.println("end");
    }
}
