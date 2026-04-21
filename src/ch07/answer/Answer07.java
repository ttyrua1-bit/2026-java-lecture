package ch07.answer;

public class Answer07 {

    static void main() {
        String str = "aaabbccccdaa";  //a3b2c4d1a2
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
            //System.out.println(str.charAt(i) +"=="+str.charAt(i+1));
        }
    }

}
