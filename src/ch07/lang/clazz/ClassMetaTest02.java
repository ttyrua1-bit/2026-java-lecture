package ch07.lang.clazz;


import java.lang.reflect.InvocationTargetException;

public class ClassMetaTest02 {
    static void main() throws Exception {
        //동적 호출  reflection
        Class helloClass = Class.forName("ch07.lang.clazz.Hello"); // class를 동적으로 호출 가능
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = "+result);
        //Hello hello = new Hello();
    }

}
