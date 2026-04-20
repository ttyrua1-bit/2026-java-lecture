package ch07.lang.string;

public class StringComparisonTest {
    static void main() {
        System.out.println((int)'A'+"==="+(int)'a');
        String str01 = "Hello, Java!";
        String str02 = "hello, java!";
        String str03 = "Hello, World!";

        System.out.println("str01 equals str02 : "+str01.equals(str02));
        System.out.println("str01 equalsIgnoreCase str02 : "+str01.equalsIgnoreCase(str02));
        System.out.println("b compareTo a : "+"b".compareTo("a")); //글자의 차이
        System.out.println("str01 compareTo str03 : "+str01.compareTo(str03)); //사전순 정의 먼저 나오면 1 늦게 나오면 -1 같으면 0
        System.out.println("str01 compareTo str02 : "+str01.compareTo(str02)); //사전순 정의 먼저 나오면 1 늦게 나오면 -1 같으면 0
        System.out.println("str01 compareToIgnoreCase str02 : "+str01.compareToIgnoreCase(str02)); //사전순 정의 먼저 나오면 1 늦게 나오면 -1 같으면 0
        System.out.println("str01 starts with 'Hello' : "+str01.startsWith("Hello"));
        System.out.println("str01 ends with 'Java!' : "+str01.endsWith("Java!"));
    }
}
