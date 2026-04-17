package review.clazz.constructor;

public class StudentMain {

    static void main() {
        Student student01 = new Student();
        student01.name="학생01";
        student01.age=15;
        student01.grade=90;
        Student student02 = new Student("학생02",16,80);
        Student student03 = new Student("학생03");
        Student student04 = new Student("학생04",17);
        System.out.println(student03.name);

    }

}
