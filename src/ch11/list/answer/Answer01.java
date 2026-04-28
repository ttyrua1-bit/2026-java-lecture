package ch11.list.answer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Answer01 {

    static void main() {
        ArrayList<String> program = new ArrayList<>();
        program.add("Java");
        program.add("Spring");
        program.add("Boot");
        System.out.println(program.get(0));
        System.out.println(program.get(1));
        System.out.println(program.get(2));
        System.out.println("=========================");
        for(int i=0;i<program.size();i++) {
            System.out.println(program.get(i));
        }
        System.out.println("=========================");
        Iterator<String> iterator = program.iterator(); //순환구조  1회용
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        try {
            System.out.println("재사용 불가 === " + iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("iterator가 한번 순환을 했습니다.");
        }
    }
}
