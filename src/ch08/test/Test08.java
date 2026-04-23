package ch08.test;

public class Test08 {

    static void main() {
        Role role = Role.ADMIN;
        if(role == Role.ADMIN) {
            System.out.println("관리자 페이지 오픈");
        } else {
            System.out.println("접근 불가");
        }
    }
}
