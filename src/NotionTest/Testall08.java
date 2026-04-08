package NotionTest;
import java.util.Scanner;

public class Testall08 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산");
        double a = scanner.nextDouble();
        String c = scanner.next();
        double b = scanner.nextDouble();
        double result;
        if(c == "+"){
            result = a+b;
            System.out.println(a+"+"+b+"의 계산결과는 "+result);
        }
        else if(c == "-"){
            result = a-b;
            System.out.println(a+"-"+b+"의 계산결과는 "+result);
        }else if(c == "*"){
            result = a*b;
            System.out.println(a+"*"+b+"의 계산결과는 "+result);
        }else{
            result=a/b;
            System.out.println(a+"/"+b+"의 계산결과는 "+result);

            if(b == 0){
                System.out.println("0으로 나눌 수 없습니다.");

            }

        }





    }
}
