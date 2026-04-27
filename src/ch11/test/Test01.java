package ch11.test;

import java.util.ArrayList;
import java.util.Vector;

public class Test01 {
    static void main() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Spring");
        arrayList.add("Boot");

        for(int i=0;i< arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }




    }




}
