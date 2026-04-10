package ch04.mission;

public class Student {
    String name;
    int grade;
    int kor;
    int eng;
    int math;

    void showInfo(){
        System.out.println("이름은 "+name+", 학년은 "+grade+" 입니다. ");
    }

    void average(){
        System.out.printf("평균은 %.2f",((kor+eng+math)/3.0));
        System.out.println();
    }

    void total(){
        System.out.println("총합은 "+(kor+eng+math));
    }


    Student(String _name, int _grade){
        name = _name; // .this 사용가능
        grade = _grade;
    }



}
