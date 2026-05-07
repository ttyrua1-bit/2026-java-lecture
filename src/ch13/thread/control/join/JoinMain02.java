package ch13.thread.control.join;

import static ch13.utils.MyLogger.log;
import static ch13.utils.ThreadUtil.sleep;

public class JoinMain02 {
    //1~100
    static void main() {
        log("start");
        SumTask sumTask01 = new SumTask(1,50);
        SumTask sumTask02 = new SumTask(51,100);
        Thread thread01 = new Thread(sumTask01);
        Thread thread02 = new Thread(sumTask02);
        thread01.start();
        thread02.start();
        log("main thread sleep");
        sleep(3000);
        log("main thread 깨어남");
        log("sumTask01.result = "+sumTask01.result); //1000
        log("sumTask02.result = "+sumTask02.result); //3450
        int sumAll = sumTask01.result+sumTask02.result;
        log("sumTask01+sumTask02 = "+sumAll);
        log("end");
    }
    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }
        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for(int i = startValue;i<=endValue;i++) {
                sum+=i;
            }
            result = sum;
            log("작업 완료 result = "+result);
        }
    }
}
