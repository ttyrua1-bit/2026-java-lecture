package ch11.list;

import java.util.ArrayList;
import java.util.Vector;

public class List01 {
    static void main() {
//        Integer arr [] = new Integer[3];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(1,100);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
