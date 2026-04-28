package ch11.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque01 {

    static void main() {
        Deque<Integer> dequeStack = new ArrayDeque<>();
        //앞으로 밀어 넣기  stack으로 동작
        dequeStack.push(1);
        dequeStack.push(2);
        dequeStack.push(3);
        System.out.println(dequeStack);
        System.out.println("deque.peek() == "+dequeStack.peek());
        System.out.println("pop = "+dequeStack.pop());
        System.out.println("pop = "+dequeStack.pop());
        System.out.println("pop = "+dequeStack.pop());
        System.out.println(dequeStack);

        Deque<Integer> dequeQueue = new ArrayDeque<>();
        dequeQueue.offer(10);
        dequeQueue.offer(20);
        dequeQueue.offer(30);
        System.out.println(dequeQueue);
        System.out.println("dequeQueue.peek() = "+dequeQueue.peek());
        System.out.println("dequeQueue.poll() = "+dequeQueue.poll());
        System.out.println("dequeQueue.poll() = "+dequeQueue.poll());
        System.out.println("dequeQueue.poll() = "+dequeQueue.poll());
        System.out.println(dequeQueue);
    }


}
