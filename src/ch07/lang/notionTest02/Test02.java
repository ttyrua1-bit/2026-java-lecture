package ch07.lang.notionTest02;

public class Test02 {

    static void main() {

        String[] arr = {"87","15","92","43","100","29"};

        int max = Integer.parseInt(arr[0]);

        for(int i =1;i<arr.length;i++){
            if(Integer.parseInt(arr[i])>max){
                max = Integer.parseInt(arr[i]);
            }
            else{
                continue;
            }

        }

        System.out.println(max);




    }



}
