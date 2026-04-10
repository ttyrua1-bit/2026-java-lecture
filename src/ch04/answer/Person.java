package ch04.answer;

public class Person {
    String name;                 //필드 라한다.Person 클래스내에서만사용가능
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    };
    void ShowInfo(){
        System.out.println("이름은 "+name+" 나이는 "+age);
    }


}
