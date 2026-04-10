package ch04.mission;

public class StudentTest {
    static void main() {
        Student student01 = new Student("장동건",3);
        student01.showInfo();

        student01.eng = 90;
        student01.kor = 90;
        student01.math = 100;

        student01.average();
        student01.total();


    }
}
