package ch13.thread.start;


//1 스레드를 상속 받아서 만들기
public class HelloThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : run()");
    }
}
