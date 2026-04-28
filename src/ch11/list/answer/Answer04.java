package ch11.list.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Answer04 {

    static void main() {
        ArrayList<String> program = new ArrayList<>();
        program.add("Java");
        program.add("Spring");
        program.add("Boot");
        if(program.contains("Java")) {
            System.out.println("java 있음");
        } else {
            System.out.println("java 없음");
        }
    }

}
