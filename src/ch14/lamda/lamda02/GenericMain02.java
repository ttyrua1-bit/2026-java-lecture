package ch14.lamda.lamda02;

public class GenericMain02 {
    static void main() {
        ObjectFunction upperCase = s -> ((String) s).toUpperCase();
        String result01 = (String) upperCase.apply("hello");
        System.out.println("result01 = "+result01);

        ObjectFunction square = n -> (Integer) n * (Integer) n;
        Integer result02 = (Integer) square.apply(3);
        System.out.println("result02 = "+result02);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
