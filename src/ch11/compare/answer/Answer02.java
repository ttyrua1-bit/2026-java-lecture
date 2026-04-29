package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer02 {
    static void main() {
        String [] words= {"banana","kiwi","apple","fig","grape","pear"};
        Arrays.sort(words, new LengthComparator());
        System.out.println(Arrays.toString(words));
    }
}
class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
        if(result ==0){
            //길이가 같으면 사전식 정렬해라...
            return o1.compareTo(o2);
        }
        return result;
    }
}
