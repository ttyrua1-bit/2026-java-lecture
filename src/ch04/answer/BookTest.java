package ch04.answer;

public class BookTest {
    static void main() {
        Book book01 = new Book();
        Book book02 = new Book("폭풍의 언덕","에밀리 브론테");
        Book book03 = new Book("홍길동전","허균",7000);

        book01.print();
        book02.print();
        book03.print();






    }
}
