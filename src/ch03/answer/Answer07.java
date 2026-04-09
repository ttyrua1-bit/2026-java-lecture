package ch03.answer;

public class Answer07 {
    static void main() {
        for(int i =2;i<=9;i++){
            for(int j = 1;j<=9;j++){
                if((i*j)%2==0){
                    System.out.println(i+" x "+j+" = "+i*j);
                }
            }
        }
    }

}
