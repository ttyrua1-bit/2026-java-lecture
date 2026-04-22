package ch07.lang.notionTest02;

public class Test01 {

    static void main() {

        String[] arr = {"10","20","30","40"};
        int sum = 0;
        //wrapper
        Integer integer = 10; //autoboxing   (=new Integer 안해도 된다.)
        for(int i =0;i<arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);










    }




}
