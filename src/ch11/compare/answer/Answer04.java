package ch11.compare.answer;

import ch11.compare.User;

import java.util.Arrays;
import java.util.Comparator;

public class Answer04 {
    static void main() {
        User[] users = {
                new User("kim", 30),
                new User("lee", 20),
                new User("park", 25),
                new User("choi", 45),

        };
        Arrays.sort(users,new UserAgeComparator());
        System.out.println(Arrays.toString(users));
    }
}
class UserAgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}