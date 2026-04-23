package ch08.test;

public class Test09 {

    static void main() {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            if(value.name().equals("DIAMOND")) {
                System.out.println("찾음 "+value.name());
            }
        }
    }

}
