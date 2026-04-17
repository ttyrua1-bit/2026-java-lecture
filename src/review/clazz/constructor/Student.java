package review.clazz.constructor;

public class Student {
    String name;
    int age;
    int grade;
    //생성자 overload
    Student() {

    }

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int age) {
//        this.name=name;
//        this.age = age;
//        this.grade = 50;

        this(name,age,50);
        System.out.println("new를 통해 객체로 생성된다.");

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


}
