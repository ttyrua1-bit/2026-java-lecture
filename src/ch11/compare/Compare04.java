package ch11.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare04 {
    static void main() {
        User user01 = new User("a", 30);
        User user02 = new User("b", 20);
        User user03 = new User("c", 10);
        User user04 = new User("c", 50);
        User user05 = new User("b", 60);
        List<User> userList = new ArrayList<>();
        userList.add(user01);
        userList.add(user02);
        userList.add(user03);
        userList.add(user04);
        userList.add(user05);
        System.out.println("기본 데이터");
        System.out.println(userList);
        System.out.println("Comparable 기본 정렬");
        userList.sort(null);
        //배열 util은 Arrays list,map,set 등은 Collections를 사용한다.
        //Collections.sort(userList); //utils
        System.out.println(userList);
        System.out.println("IdComparator 정렬");
        userList.sort(new IdComparator());
        System.out.println(userList);

    }
}
