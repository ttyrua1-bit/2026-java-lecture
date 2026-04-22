package ch08.enumeration.ex04;

import ch08.enumeration.ex03.ClassGrade;

public class ClassReferenceTest {
    static void main() {
        System.out.println("class BASIC = "+ Grade.BASIC.getClass());
        System.out.println("class GOLD = "+Grade.GOLD.getClass());
        System.out.println("class DIAMOND = "+Grade.DIAMOND.getClass());

        System.out.println(Grade.BASIC); //toString() 재정의해서 사용하기 때문에 고유값이 나오지 않는다.
        System.out.println(Grade.GOLD);
        System.out.println(Grade.DIAMOND);

        System.out.println("reference BASIC = " + System.identityHashCode(Grade.BASIC));
        System.out.println("reference GOLD = " + System.identityHashCode(Grade.GOLD));
        System.out.println("reference DIAMOND = " + System.identityHashCode(Grade.DIAMOND));
    }
}
