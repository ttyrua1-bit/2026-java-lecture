package ch04;

public class Book {
    String title;
    String author;
    Book(String _title){
        this.title = _title;
        //속성의 이름이 같으면 this. 쓴다 this.는 Book클래스를 가리키는것
        //주로 멤버 변수(속성)에 접근할때 쓴다. 생략이 가능하다.
        author = "작자미상";

    }


    Book(String _title, String _author){
        title = _title;
        author = _author;
    }
    void showInfo(){
        System.out.println("작가는 "+author+", 제목은 "+title);
    }

}
