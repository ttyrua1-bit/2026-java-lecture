package ch13.thread.start;

import ch13.utils.MyLogger;

public class InnerRunnableMain04 {
    static void main() {
        MyLogger.log("main() start");
        //익명 클래스  람다랑 연결...
        //람다식은 구현해야 되는 메서드가 하나인 인터페이스를 구현해야할 때 쓰는 방법이다.
        Thread thread = new Thread(() -> MyLogger.log("run()"));
        thread.start();
        MyLogger.log("main() end");
    }



}