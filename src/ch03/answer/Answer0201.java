package ch03.answer;

public class Answer0201 {
    static void main() {

        int sum = 0;

        for(int i =1;i<=100;i++){
            if(i%2 == 0){
                sum+=i;
            }
        }

        System.out.println("합은: "+sum);

        int sum1 = 0;
        int j = 1;
        while(j<=100){
            if(j%2 == 0){
                sum1 +=j;

            }
            j++;

        }
        System.out.println("합은: "+sum1);






    }
}
