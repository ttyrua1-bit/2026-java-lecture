package ch11.test;
import java.util.ArrayList;

public class Test02 {
    static void main() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        arrayList.add(1,"X");

        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }






    }

}
