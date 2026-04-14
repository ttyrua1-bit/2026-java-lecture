package ch05.casting;

public class UpcastingTest {

    static void showInfo(Person person) {
        //System.out.println(student.grade);
        //System.out.println(student.department);
        System.out.println(person.name);
        System.out.println(person.id);

        if( person instanceof Student) {
            Student student = (Student)person;
            System.out.println("=========");
            System.out.println("grade : "+student.grade);
            System.out.println("department : "+student.department);
            System.out.println("=========");
        } else if(person instanceof Researcher) {
            Researcher researcher = (Researcher)person;
            System.out.println("=========");
            System.out.println("age : "+researcher.age);
            System.out.println("scholarship : "+researcher.scholarship);
            System.out.println("=========");
        }
    }
//    static void showInfoResearcher(Researcher researcher) {
//        System.out.println(researcher.age);
//        System.out.println(researcher.scholarship);
//    }

    static void main() {

        Student student = new Student("장성호");
        Researcher researcher = new Researcher("장교수");
        student.id="1234";
        student.grade=3;
        student.department="coding";
        researcher.scholarship = 10;
        showInfo(student);
        showInfo(researcher);
        //showInfoResearcher(researcher);


    }

}
