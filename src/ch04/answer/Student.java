package ch04.answer;

public class Student {
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double average;

    Student(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor+eng+math;
        this.average = total/3.0;
    }

    void getTotal(){
        System.out.println("총점: "+ total);
    }

    void getAverage() {
        System.out.printf("평균: %.2f", average);

    }

}
