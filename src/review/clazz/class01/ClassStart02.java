package review.clazz.class01;

public class ClassStart02 {
    static void main() {
        Student student01 = new Student();
        student01.name="학생01";
        student01.age=15;
        student01.grade=90;
        Student student02 = new Student();
        student02.name="학생02";
        student02.age=16;
        student02.grade=80;
        Student student03 =  student01;
        System.out.println(student01);
        System.out.println(student02);
        System.out.println(student03);
        student03.name="학생03";
        System.out.println(student01.name+"==="+student03.name);

        Student [] students = new Student[3];
        students[0] = student01;
        students[1] = student02;
        students[2] = student03;
        for(Student student:students) {
            System.out.println(student.name+"/"+student.age+"/"+student.grade);
        }
    }






}
