package ch13.thread.start;

//main도 스레드다. HelloThreadMain에서 run 메서드는 컴퓨터가 임의로 만든 이름의 스레드에 있게되는데
//아래코드로 하면 스레드 만들어지지 않음. main() 안에서 run()이 실행.


public class BadThreadMain {
    static void main() {
        System.out.println(Thread.currentThread().getName()+ " : main() start");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+" :  start() 호출 전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName()+" :  start() 호출 후");
        System.out.println(Thread.currentThread().getName()+ " : main() end");
    }
}
