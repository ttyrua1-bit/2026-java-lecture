package review.variable;

public class variable {

    //같은 텍스트 선택 alt + j

    static void main() {
        // 10,true,"스트링",'char'  literal
        int num = 10;
        int num02;
        num02= 10;
        String name = "장성호"; //type 언어
        double b = 0.5;
        char c = 'c';
        boolean d = true;
        //같은 텍스트 선택 alt + j
        byte varByte = 127;            //8bit   1byte
        short varShort = 12700;        //16bit  2byte
        int varInt = 199090;           //32bit  4byte   정수는 int를 기본으로 한다. 즉 숫자 뒤에 아무거도 안쓰면 int로 인식
        long varLong =  90_909_090_909l;   //64bit  8byte
        float varFloat = 0.3333f;
        double varDouble = 0.3333;    //실수는 double을 기본으로 한다. 실수 뒤에 아무것도 쓰지 않으면 double이 된다.
        System.out.println(num);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name);
    }





}
