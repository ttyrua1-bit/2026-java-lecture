package ch11.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Queue01 {

    static void main() {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");
        System.out.println(queue);
        System.out.println("다음 꺼낼 요소 확인 : "+queue.peek());
        System.out.println("queue.poll() : "+queue.poll());
        System.out.println("==============");


    }



}
