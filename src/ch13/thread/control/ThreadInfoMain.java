package ch13.thread.control;

import ch13.thread.start.HelloRunnable;
import ch13.utils.MyLogger;

import static ch13.utils.MyLogger.log;

public class ThreadInfoMain {
    static void main() {
        Thread mainThread = Thread.currentThread();
        log("mainThread = "+mainThread);
        log("mainThread.threadId() = "+mainThread.threadId());
        log("mainThread.getName() = "+mainThread.getName());
        log("mainThread.getPriority() = "+mainThread.getPriority());
        log("mainThread.getThreadGroup() = "+mainThread.getThreadGroup());
        log("mainThread.getState() = "+mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(),"myThread");
        log("myThread = "+myThread);
        log("myThread.threadId() = "+myThread.threadId());
        log("myThread.getName() = "+myThread.getName());
        log("myThread.getPriority() = "+myThread.getPriority());
        log("myThread.getThreadGroup() = "+myThread.getThreadGroup());
        log("myThread.getState() = "+myThread.getState());
        myThread.start();
        log("myThread.getState() = "+myThread.getState());

        // NEW / RUNNABLE / BLOCKED / WAITING / TIME_WAITING / TERMINATED
    }
}
