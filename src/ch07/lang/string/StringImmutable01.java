package ch07.lang.string;

public class StringImmutable01 {
    static void main() {
        String str01 = "hello";
        String str02 = str01.concat(" java");
        System.out.println(str01);
        System.out.println(str02);
    }
}
