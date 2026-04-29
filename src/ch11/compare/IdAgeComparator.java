package ch11.compare;
import java.util.Comparator;

public class IdAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int result = o1.getId().compareTo(o2.getId());
        if(result==0) {
            return Integer.compare(o2.getAge(),o1.getAge());
        }
        return result;
    }
}