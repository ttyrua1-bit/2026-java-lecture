package ch08.enumeration.ex04;

public class EnumMethodTest {
    static void main() {
        System.out.println(Grade.valueOf("GOLD"));
        System.out.println(Grade.valueOf("BASIC"));
        System.out.println(Grade.valueOf("DIAMOND"));
        System.out.println(Grade.BASIC.name());
        System.out.println(Grade.BASIC.ordinal());
        System.out.println(Grade.GOLD.name());
        System.out.println(Grade.GOLD.ordinal());
        System.out.println(Grade.DIAMOND.name());
        System.out.println(Grade.DIAMOND.ordinal());
        Grade [] values = Grade.values(); //
        for(Grade value : values) {
            System.out.println(value.ordinal()+" / "+value.name());
        }
        Grade gold = Grade.GOLD;
        if(gold.name().equals("GOLD")) {
            //문자로 넘어왔을때
            System.out.println("GOLD");
        }
        if(gold == Grade.GOLD) {
            //되도록이면 이걸 사용
            System.out.println("GOLD");
        }
        if(gold.ordinal() == 2) {
            System.out.println("gold.ordinal() == 2");
        }
    }
}
