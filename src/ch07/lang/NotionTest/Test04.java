package ch07.lang.NotionTest;

public class Test04 {
    static void main() {

        String fileName = "photo.png";

        int index = fileName.lastIndexOf('.');

        System.out.println("파일 이름 : "+fileName.substring(0,index));

        System.out.println("확장자 : "+fileName.substring(index+1));





    }


}
