package ch14.lamda.methodref;

import java.util.function.Function;

public class MethodRefEx02 {
    static void main() {
        //임의 객체의 인스턴스 메서드 참조
        Person person01 = new Person("장성호");
        Person person02 = new Person("정형돈");
        Person person03 = new Person("유재석");
        Function<Person, String> function01 = (Person person) -> person.introduce();
        System.out.println("person01.introduce = " + function01.apply(person01));
        System.out.println("person02.introduce = " + function01.apply(person02));
        System.out.println("person03.introduce = " + function01.apply(person03));

        Function<Person, String> function02 = Person::introduce;
        System.out.println("person01.introduce = " + function02.apply(person01));
        System.out.println("person02.introduce = " + function02.apply(person02));
        System.out.println("person03.introduce = " + function02.apply(person03));

    }
}
