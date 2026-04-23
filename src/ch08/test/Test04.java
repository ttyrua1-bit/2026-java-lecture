package ch08.test;

public class Test04 {
    static void main() {
        String str = "GOLD";
        Grade grade = Grade.valueOf(str);
        System.out.println(grade);
        System.out.println(grade.name());
        System.out.println(grade.ordinal());

        System.out.println(grade.equals(str));
    }
}
