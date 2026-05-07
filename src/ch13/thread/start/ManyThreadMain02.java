package ch13.thread.start;


//순서가 정해지지않고 자기 마음대로 나옴
public class ManyThreadMain02 {
    static void main() {
        System.out.println(Thread.currentThread().getName()+ " : main() start");
        for(int i=0;i<100;i++){
            HelloRunnable helloRunnable = new HelloRunnable();
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        System.out.println(Thread.currentThread().getName()+ " : main() end");
    }
}
