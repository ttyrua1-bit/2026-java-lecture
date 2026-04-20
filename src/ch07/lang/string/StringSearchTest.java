package ch07.lang.string;

public class StringSearchTest {
    static void main() {
        String str = "Hello, Java! Welcome to Java World";
        System.out.println("문자열에 Java가 포함되어 있는지: "+str.contains("Java"));
        System.out.println("Java의 첫번째 index : "+str.indexOf("Java"));
        System.out.println("Java의 마지막 index : "+str.lastIndexOf("Java"));
        //System.out.println("Java의 마지막 index : "+str.lastIndexOf("oracle"));  결과값 -1
        //그냥 indexOf의 값도 거짓이면 -1


    }
}
