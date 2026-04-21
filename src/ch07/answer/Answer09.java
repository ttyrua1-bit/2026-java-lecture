package ch07.answer;

public class Answer09 {

    static void main() {
        String str = "level";
        boolean isPalindrom = true;
        int end = str.length();
        for (int i = 0; i < end / 2; i++) {
            if (str.charAt(i) != str.charAt(end - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("거꾸로 읽어도 같은 단어");
        } else {
            System.out.println("거꾸로 읽어도 다른 단어");
        }
    }

}
