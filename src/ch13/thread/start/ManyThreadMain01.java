package ch13.thread.start;


//순서가 정해지지않고 자기 마음대로 나옴
public class ManyThreadMain01 {
    static void main() {
        System.out.println(Thread.currentThread().getName()+ " : main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread01 = new Thread(helloRunnable);
        thread01.start();
        Thread thread02 = new Thread(helloRunnable);
        thread02.start();
        Thread thread03 = new Thread(helloRunnable);
        thread03.start();
        System.out.println(Thread.currentThread().getName()+ " : main() end");
    }
}
