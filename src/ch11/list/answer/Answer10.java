package ch11.list.answer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Answer10 {

    static void main() {
        String[] alphabet = {"A", "B", "A", "C", "B","D","F","C","B","A"};
        //List<String> alphabetList = Arrays.asList(alphabet);
        ArrayList<String> alphabetList = new ArrayList<>(Arrays.asList(alphabet));
        ArrayList<String> newAlphabetList = new ArrayList<>();

        //alphabetList.remove("A");

        Iterator<String> iterator = alphabetList.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (!newAlphabetList.contains(temp)) {
                newAlphabetList.add(temp);
            }
        }
        Iterator<String> iterator02 = newAlphabetList.iterator();
        while (iterator02.hasNext()) {
            System.out.println(iterator02.next());
        }
    }


}
