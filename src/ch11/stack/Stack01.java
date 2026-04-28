package ch11.stack;

import java.util.Stack;

public class Stack01 {
    //ArrayList, Hashmap    << 꼭 알아야함

    static void main() {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println("다음 꺼낼 요소 확인 : "+stack.peek());
        System.out.println("stack.pop() : "+stack.pop());
        System.out.println("==============");
        System.out.println(stack);
        System.out.println("다음 꺼낼 요소 확인 : "+stack.peek());
        System.out.println("stack.pop() : "+stack.pop());
        System.out.println("==============");
        System.out.println(stack);
        System.out.println("다음 꺼낼 요소 확인 : "+stack.peek());
        System.out.println("stack.pop() : "+stack.pop());

    }




}
