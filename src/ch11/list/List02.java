package ch11.list;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class List02 {

    static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);  //1.5배 정도로 확대
        System.out.println("arrayList.size() == "+arrayList.size());
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(0);
        System.out.println("0번째 요소 제거");
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("값이 20인 요소 지우기");
        arrayList.remove(Integer.valueOf(20));
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> names =  new ArrayList<>();
        names.add("장성호");
        names.add("홍길동");
        names.add("이순신");
        names.remove(0);
        names.remove("홍길동");
        for(int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }
    }
}
