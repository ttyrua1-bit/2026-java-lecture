package review.static01;

//https://github.com/jjang051jhta/2026-java-lecture/blob/master/src/review/static01/MathArrayUtils.java
//참고



public class MathArrayUtils {
    public static int sum(int[] array){
        int total=0;
        for(int i=0;i< array.length;i++){
            total += array[i];
        }
        return total;
    };
    public static double average(int[] array){
        int total=0;
        int count=0;
        for(int i=0;i< array.length;i++){
            total += array[i];
            count++;
        }
        return (double)total/count;
    };
    public static int min(int[] array){
        int min = 10000;
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    };
    public static int max(int[] array){
        int max = 0;
        for(int i=0;i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    };


}
