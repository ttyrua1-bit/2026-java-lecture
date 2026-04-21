package ch07.answer;

public class Answer08 {

    static void main() {
        String str = "Java Spring Programming Boot";
        String [] words = str.split(" ");
        //System.out.println(strArray[0]);
        String longest = "";
        for(String word:words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }

}
