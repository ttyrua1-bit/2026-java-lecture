package ch13.thread.start;

import ch13.utils.MyLogger;

public class InnerRunnableMain02 {
    static void main() {
        MyLogger.log("main() start");
        //익명 클래스  람다랑 연결...
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() end");
    }



}