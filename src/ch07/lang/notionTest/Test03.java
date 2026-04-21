package ch07.lang.notionTest;

public class Test03 {
    static void main() {

        String fileName = "document.pdf";

        int index = fileName.lastIndexOf('.');
        System.out.println(fileName.substring(index+1));




    }


}
