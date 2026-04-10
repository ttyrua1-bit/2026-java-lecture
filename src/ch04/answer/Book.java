package ch04.answer;

public class Book {
    String title;
    String author;
    int price;

    Book(){
        title="제목없음";
        author = "저자없음";
        price = 1000;
        //this("제목없음","저자없음",1000);   //위 또는 왼쪽 과같이 쓸수있다.
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
        price = 1000;
        //this(title,author,1000);
    }

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void print(){
        System.out.println("제목은 "+title+" 저자는 "+author+" 가격은 "+price);
    }



}
