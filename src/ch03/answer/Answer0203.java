package ch03.answer;
import java.util.Scanner;


public class Answer0203 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
