package ch07.lang.string;

public class StringBasicTest {
    static void main() {

        String str01 = "hello";  //참조형 데이터
        String str02 = new String("hello");  // heap
        System.out.println("str01 = "+str01);
        System.out.println("str02 = "+str02);
        System.out.println(str01+"==="+str02);
        System.out.println(System.identityHashCode(str01));
        System.out.println(System.identityHashCode(str02));
        System.out.println(str01 == str02); // 동일성
        System.out.println(str01.equals(str02)); // 동등성
        String str03 = "java";  //String Pool
        String str04 = "java";
        String str05 = "java";
        String str06 = "java";
        System.out.println(str03 == str04);
        System.out.println(System.identityHashCode(str03));
        System.out.println(System.identityHashCode(str04));
        System.out.println(System.identityHashCode(str05));
        System.out.println(System.identityHashCode(str06));
    }
}
