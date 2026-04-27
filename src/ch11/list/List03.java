package ch11.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List03 {
    static void main() {
        ArrayList<String> names =  new ArrayList<>();  //추론
        names.add("홍길동");
        names.add("전우치");
        names.add("아무개");
        Iterator<String> iterator = names.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for(int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }
        names.clear(); //싹다 지우기
//        for(int i=0;i<names.size();i++){
//            names.remove(i);
//        }
        System.out.println(names.get(0));
    }
}
