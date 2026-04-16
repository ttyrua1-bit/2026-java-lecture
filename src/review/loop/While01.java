package review.loop;

public class While01 {

    static void main() {
        int count = 0;
//        count++;
//        System.out.println("현재 숫자는 : "+count);
//        count++;
//        System.out.println("현재 숫자는 : "+count);
//        count++;
//        System.out.println("현재 숫자는 : "+count);
        long start = System.nanoTime();
        while(count<100) {
            count++;
            if(count%5==0) {
                break;
            }
            System.out.println("현재 숫자는 : "+count);
        }
        long end = System.nanoTime();
        long diff = end-start;
        System.out.println("걸린 시간 (ns): "+diff);
        System.out.println("걸린 시간 (ms): "+diff/1_000_000.0);
    }


}
