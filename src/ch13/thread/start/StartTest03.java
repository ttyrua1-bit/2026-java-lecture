package ch13.thread.start;

import ch13.utils.MyLogger;

public class StartTest03 {
    static void main() {
        //CountThread countThread = new CountThread();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++) {
                    MyLogger.log("value : "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread countThread = new Thread(runnable,"counter");
        countThread.start();
    }

}
