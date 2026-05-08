package ch14.lamda.start;

public class Ex01Main {
    static void helloJava() {
        //변하지 않는 부분
        System.out.println("프로그램 시작");

        //변하는 부분
        System.out.println("hello java");   //literal

        //변하지 않는 부분
        System.out.println("프로그램 종료");
    }
    static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("hello spring");
        System.out.println("프로그램 종료");
    }
    static void hello(String str) {
        //변하지 않는 부분
        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");
    }

    static void main() {
        //helloJava();
        //helloSpring();
        hello("hello java");
        hello("hello spring");
    }
}