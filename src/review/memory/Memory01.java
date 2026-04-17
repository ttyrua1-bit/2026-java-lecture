package review.memory;

public class Memory01 {
    static void main() {
        System.out.println("main start");  //1
        method01(10);
        System.out.println("main end");    //6
    }

    static void method01(int m1){
        System.out.println("method01 start");  //2
        int cal = m1*2; //지역 변수이다., 스택영역에서 관리한다.(매개변수도)
        method02(cal);
        System.out.println("method01 end");    //5
    }


    static void method02(int m2){
        System.out.println("method02 start");  //3
        System.out.println("method02 end");    //4
    }
    //

}
