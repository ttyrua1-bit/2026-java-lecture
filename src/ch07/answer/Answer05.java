package ch07.answer;

public class Answer05 {
    static void main() {
        String email = "java123@gmail.com"; //아이디 도메인 분리
        int idx = email.lastIndexOf("@");
        System.out.println(idx);
        String name =  email.substring(0,idx);
        String extension =  email.substring(idx+1);
        System.out.println("아이디 : "+name);
        System.out.println("도메인 : "+extension);
    }
}
