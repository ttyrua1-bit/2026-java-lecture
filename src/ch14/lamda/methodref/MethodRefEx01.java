package ch14.lamda.methodref;

import java.util.function.Supplier;

public class MethodRefEx01 {
    static void main() {
        //1. static method 참조
        Supplier<String> staticMethod01 = () -> Person.greeting();
        System.out.println("staticMethod01 : "+staticMethod01.get());
        Supplier<String> staticMethod02 = Person::greeting;
        System.out.println("staticMethod02 : "+staticMethod02.get());
        //2. 특정 객체의 인스턴스 참조
        Person person = new Person("장성호");
        Supplier<String> instanceMethod01 = () -> person.introduce();
        System.out.println("instanceMethod01 : "+instanceMethod01.get());
        Supplier<String> instanceMethod02 = person::introduce;
        System.out.println("instanceMethod02 : "+instanceMethod02.get());

        //3. 샘성자 참조
        Supplier<Person> newPerson01 = ()-> new Person();
        System.out.println("newPerson01 : "+newPerson01.get());
        Supplier<Person> newPerson02 = Person::new;
        System.out.println("newPerson02 : "+newPerson02.get());





    }
}