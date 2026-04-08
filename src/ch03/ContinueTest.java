package ch03;

public class ContinueTest {
    static void main() {
        int sum = 0;

        //continue는 건너뛰기(반복문 안에있는 실행문을)
        for(int i=1;i<=30;i++){
            if(i%2 == 0)  //짝수건너뛰기
            {
                continue;    //break;는 반복문을 빠져나가는거
            }
            sum+=i;
            System.out.print(i+"/");
        }

    }
}
