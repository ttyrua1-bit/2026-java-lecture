package ch03;

public class WhileTest {
    static void main() {
        int i = 0;
        int sum = 0;
        while(i<=10){
            sum+=i;
            i++;    // <순서 중요함 8번줄보다 아래에 와야함
        }

        System.out.println("1부터 10까지의 수의합은 "+sum);
        // < ln은 줄바꿈을 의미함. 없으면 이어서 써짐


        // 조건문의 범위를 알고있을때 for문을 많이쓴다.
    }
}
