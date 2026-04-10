package ch04;

public class BookTest {
    static void main() {
        Book book01 = new Book("춘향전"); //"춘향전"을 안쓰면 에러가뜨는데
        // 디폴트 생성자가 없기때문이다. (클래스파일에)
        book01.showInfo();

        Book book02 = new Book("홍길동전","허균");
        book02.showInfo();

    }



}
