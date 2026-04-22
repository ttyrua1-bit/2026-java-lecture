package ch08.enumeration.ex03;

public class ClassReferenceTest {
    static void main() {
        System.out.println("class BASIC = "+ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = "+ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ClassGrade.DIAMOND.getClass());
        System.out.println("reference BASIC = "+ClassGrade.BASIC);
        System.out.println("reference GOLD = "+ClassGrade.GOLD);
        System.out.println("reference DIAMOND = "+ClassGrade.DIAMOND);
    }
}
