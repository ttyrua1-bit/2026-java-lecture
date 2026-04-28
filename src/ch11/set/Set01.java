package ch11.set;

import java.util.*;


public class Set01 {

    static void main() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java");
        set.add("Oracle");
        System.out.println(set);
        for (String str : set) {
            System.out.print(str + "/");
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,4,3,5,6,7,8,1,2,3);
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);

        Random random = new Random();
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 6) {
            lotto.add(random.nextInt(45)+1);
        }
        System.out.println(lotto);
    }


}
