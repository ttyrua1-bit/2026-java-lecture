package NotionTest;
import java.util.Scanner;


public class Testall05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개 입력");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        //if(a+b > c && a+c > b && b+c > a)
        if(!(a+b <= c || a+c <= b || b+c <= a))
        {
            System.out.println("삼각형이 됩니다.");
        }
        else{
            System.out.println("삼각형이 될 수 없습니다.");
        }


    }
}
