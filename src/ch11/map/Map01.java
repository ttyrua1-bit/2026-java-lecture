package ch11.map;

import java.util.*;

public class Map01 {

    static void main() {
        Map<String,String> map = new HashMap<>(); //순서가 없다.
        //만약 순서가 꼭 필요할때는 LinkedHashMap<>()을 쓴다.
        //만약 key를 기준으로 정렬이 필요하면 TreeMap<>()을 쓴다.
        map.put("melon","수박");  // set은 중복을 허용하지 않는다. map의 key는 set 구조이다.
        map.put("apple","사과");
        map.put("peach","복숭아");
        map.put("orange","오렌지");
//        System.out.println(map.get("apple"));
//        System.out.println(map.get("melon"));
//        System.out.println(map.get("peach"));
//        System.out.println(map.get("orange"));
        for(String key:map.keySet()) {
            //System.out.println(key);
            System.out.println(map.get(key));
        };
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        for(Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" / "+entry.getValue());
        }
        System.out.println("===========");
        Iterator<Map.Entry<String,String>> entryIterator =  map.entrySet().iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String,String> entry = entryIterator.next();
            //System.out.println(entryIterator.next().getKey()+" / "+entryIterator.next().getValue());
            System.out.println(entry.getKey()+" / "+entry.getValue());
        }
    }
}
