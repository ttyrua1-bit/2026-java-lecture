package ch11.list;

import java.util.ArrayList;

public class List04 {
    static void main() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("장성호",99,98,97));
        students.add(new Student("한정웅",70,75,55));
        System.out.println(students.get(0).name);
        System.out.println(students.get(0).kor);
    }
}
class Student {
    public String name;
    public int kor;
    public int eng;
    public int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}