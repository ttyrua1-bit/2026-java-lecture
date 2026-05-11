package ch00Test;


import ch14.stream.operation.IntermediatedOperationMain;

import java.util.List;

public class NotionTest {
    static void main() {
        List<String> words = List.of("apple","kiwi","banana","fig","grape");

        //int sum = words.stream().mapToInt(Integer::parseInt).filter(s->s>=5).sum();



        System.out.print("길이가 5 이상인 문자열들의 글자 수 합계는: "+sum);




    }


}
