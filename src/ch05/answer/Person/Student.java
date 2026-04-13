package ch05.answer.Person;

public class Student extends Person{

    int grade;

    Student(String name,int age, int grade) {
        super(name,age);
        this.grade = grade;
    }



    void showInfo(){
        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("학년: "+ grade);
    }




}
