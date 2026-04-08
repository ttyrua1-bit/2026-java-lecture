package NotionTest;
import java.util.Scanner;

public class Testall04 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개 입력");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int center = 0;


        if((a >=b && a <=c) || (a >= c && a <= b)){
            center = a;
        }else if(b >= a && b <= c || b<=a && b >=c){
            center = b;
        }else{
            center = c;
        }

        System.out.println("세 숫자 "+a +","+b+","+c+"의 중간은 "+center+"입니다.");















    }
}
