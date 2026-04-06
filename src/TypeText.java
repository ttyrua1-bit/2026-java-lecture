public class TypeText {
    static void main(){
        //자바에서 타입은 기본 타입 8개
        boolean isBool = true;   // true 나 false만 사용가능
        char ch = 'a';       //작은따옴표로 문자 하나만 표시.
        // 이때 문자는 전부 정수로 변환가능하다.
        byte b = 127;    //127까지만 쓸수있다.128쓰면 줄그어짐
        //-128 ~ 127까지 쓸수있다. 1byte 정수 8bit
        short sh = 10000; //2의 16승
        int  num = 19_0989_9800; //2의 32승   _로 끊어서 사용가능
        long long_num = 1999999999L;
        float num_float = 0.2f;
        double num_double = 0.2;
        //자바는 정수 기본으로 int로 인식 실수는 기본으로 double로 인식
        //그래서 큰수는 뒤에 L붙여야하고   float는 뒤에 f붙여야한다.
        // String str = "이재헌"; String은 참조타입이지만 기본타입으로도 쓰임
        System.out.println(isBool);         //sout 쓰고 엔터하면 완성된다. 출력문
        String strNull = null;    //null 리터럴 아무값도 안가짐
        var myVar = 'a'; //타입을 따로 지정하지 않아도 됨.java가 추론하려면 값이 있어야함
        //선언과 동시에 값을 할당해야함 거꾸로 추론하기때문에 값이 없으면 에러
        // = 대입연산자 오른쪽값을 왼쪽에 대입하라
        //리터럴은 프로그래밍에서 사용하는 재료 주로 숫자 문자등 하나의 값으로 인식된다.



        char ch02 = 65;    //  65 - 'A', 66 - 'B' 44832~55203사이의 정수를
        // char로 바꾸면 한글이 나온다.
        char ch03 = '힣';
        System.out.println(   (int)ch03   ); //형변환(type casting)

        int age = 30;
        age = 31;

        final double PI = 3.14;   //상수 는 final 붙여 만든다. 변환이 불가능하다.
        // PI = 4.25;
        System.out.println(PI);

        //type casting 형변환
        int num04 = 10;
        System.out.println(num04*3.14);
        System.out.println(314/(double)10);
        System.out.println((int)2.9);  // 작은 타입은 큰 타입에 대입가능하다.
        // 이때 아무런 영향을 받지 않는다.
        byte b02 = (byte)num04;  //큰 타입을 작은 타입에 넣을때는
        // 반드시 형변환이 필요하다. 이때 값의 손실이 일어난다.

        //참조타입





        }
}
