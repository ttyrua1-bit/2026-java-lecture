package ch08.test;

public class Test03 {
    static void main() {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println(value.name());
            System.out.println(value.ordinal());
        }
        System.out.print(Grade.BASIC.name() + "/" + Grade.BASIC.ordinal());
        System.out.println();
        System.out.print(Grade.GOLD.name() + "/" + Grade.GOLD.ordinal());
        System.out.println();
        System.out.print(Grade.DIAMOND.name() + "/" + Grade.DIAMOND.ordinal());
        System.out.println();
    }
}
