package ch07.lang.notionTest;

public class Test05 {

    static void main() {

        String email = "java123@gmail.com";

        int index = email.indexOf('@');

        System.out.println("아이디: "+email.substring(0,index));
        System.out.println("도메인: "+email.substring(index+1));





    }
}
