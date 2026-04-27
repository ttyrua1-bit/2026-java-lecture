package ch11.test;

import java.util.ArrayList;

public class Test03 {
    static void main() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        arrayList.set(0,"Z");

        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }










    }




}
