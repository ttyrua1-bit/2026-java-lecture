package ch11.list.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//특정 위치에 값 삽입
//["A", "B", "C"]에서 인덱스 1 위치에 "X"를 삽입하시오.
//add(index, value)
public class Answer02 {

    static void main() {
        ArrayList<String> alphabet = new ArrayList<>();  //찾는데 최적화  중간 삽입 삭제는 느리다.
        //LinkedList<String> alphabet =  new LinkedList<>(); // 예를 들면 점조직 a는 다음 node인 b를 알고 있다. b는 c의 참조값을 알고 있다.
        // 찾는데 느리다. 대신 삽입 삭제는 빠르다.
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add(1,"X");
        Iterator<String> iterator = alphabet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " / ");
        }
    }


}
