package ch07.answer;

public class Answer01 {

    static void main() {
        String str = "Java Programming";
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //StringBuilder
        System.out.println(new StringBuilder(str).reverse().toString());
    }

}
