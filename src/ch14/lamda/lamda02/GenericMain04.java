package ch14.lamda.lamda02;

public class GenericMain04 {
    static void main() {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String result01 = upperCase.apply("hello");
        System.out.println("result01 = " + result01);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer result02 = square.apply(3);
        System.out.println("result02 = " + result02);

        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;
        Boolean result03 = isEven.apply(10);
        System.out.println("result03 = " + result03);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}