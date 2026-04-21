package ch07.lang.notionTest02;

public class Test10 {
    static void main() {

        String[] arr={"100","200","hello","300","java","400"};

        int count = 0;

        for(int i=0;i<arr.length;i++){

            try{
                Integer.parseInt(arr[i]);
                count++;
            }catch(NumberFormatException e){

            }
        }
        System.out.println(count);







    }



}
