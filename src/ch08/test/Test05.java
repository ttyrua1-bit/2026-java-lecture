package ch08.test;

public class Test05 {

    static void main() {
        String str = "VIP";
        try{
            Grade grade = Grade.valueOf(str);
            System.out.println(grade);
        } catch (IllegalArgumentException e) {
            System.out.println("VIP 등급은 없습니다.");
        }
    }
}
