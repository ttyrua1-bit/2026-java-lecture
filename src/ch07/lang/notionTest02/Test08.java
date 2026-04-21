package ch07.lang.notionTest02;

public class Test08 {
    static void main() {

        String[] arr = {"11","24","36","41","52","67","80"};
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(Integer.parseInt(arr[i])%2 == 0){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);






    }



}
