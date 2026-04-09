package ch04;

//class
public class ClassTest01 {
    static void main() {
        Student student01 = new Student();  //new <생성자라함 이걸로 클래스호출하면
        //특정한 메모리에 올라옴   클래스 언제든 만들수있다. 참조타입이다.
        // 주소값참조 == 변경하면 같이 변경된다.

        student01.name="전세진";
        student01.age = 25;
        student01.weight = 65.5;
        student01.iq = 130;

        Student student02 = new Student();
        student02.name="이재헌";
        student02.weight = 70;
        student02.iq = 120;
        student02.age = 28;

        Student student03 = student02;
        //같은 주소를 가리키기 때문에 변경하면 같이 변경됨
        student03.name = "이름입니다."; //변경되고
        student02.name = "진짜 이름";  // 한번더 변경됨

        System.out.println(student02.name);

    }
}
