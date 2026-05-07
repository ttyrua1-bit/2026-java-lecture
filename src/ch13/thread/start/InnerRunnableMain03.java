package ch13.thread.start;

import ch13.utils.MyLogger;

public class InnerRunnableMain03 {
    static void main() {
        MyLogger.log("main() start");
        //익명 클래스  람다랑 연결...
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        });
        thread.start();
        MyLogger.log("main() end");
    }



}