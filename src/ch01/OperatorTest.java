package ch01;

public class OperatorTest {
    static void main() {
        //산술연산  +,-,*,/,%
        System.out.println(10+10);
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println(10/5);
        System.out.println(10%5);


        //10/0   하면 오류 예외처리뜸
        int time = 5000;

        int hour = time/60/60;
        int minute = time/60%60;
        int second = time%60;

        System.out.println(hour+"시"+minute+"분"+second+"초");


        ///////////////////////////////////////////////////////
        int a = 1;
        int b = 1;         /// int a=1,b=1; 로도 가능하다.타입이 같을때만
        a = a+1;
        a += 1;      //위와 같은 결과
        a++;           // 총 a는 4가된다.
        int c=a++;     //++이 뒤에있으면 할당연산자 먼저이다.후위증감연산자
        //int c=++a;   선위증감연산자 먼저할당하고 나중에 연산
        //Java에는 ** 없다.

        System.out.println(a+"==="+c);

        //비교 연산  결과값이 항상 boolean 으로 나옴
        int d = 5;
        int e = 3;

        System.out.println(d > e);   //true 나옴
        System.out.println(d < e);   //false 나옴
        System.out.println(d >= e);  //크거나 같다
        System.out.println(d <= e);  //작거나 같다
        System.out.println(d == e);  //같다
        System.out.println(d != e);  //다르다

        //논리연산

        System.out.println( !(5 > 3) );   //부정연산 not
        System.out.println(!true);

        System.out.println(5 > 3  || 4 > 5 );    //OR 연산
        System.out.println(5 > 3  && 4 > 5 );    //AND 연산
        System.out.println(5 > 3   ^ 4 > 5 );    //XOR 연산 서로 다르면 true 서로 같으면 false




    }




}
