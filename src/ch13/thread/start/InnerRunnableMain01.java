package ch13.thread.start;

import ch13.utils.MyLogger;

public class InnerRunnableMain01 {
    static void main() {
        MyLogger.log("main() start");
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            MyLogger.log("run()");
        }
    }

}