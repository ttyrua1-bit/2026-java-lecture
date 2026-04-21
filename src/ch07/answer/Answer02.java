package ch07.answer;

public class Answer02 {
    static void main() {
        String str = "banana";
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
