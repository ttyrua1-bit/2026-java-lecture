package NotionTest;
import java.util.Scanner;

public class Testall09 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몸무게와 키를 입력하시오(kg)(cm)");
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double realheight = height*0.01;
        double bmiheight = (realheight)*(realheight);

        double bmi = (weight/bmiheight)+(weight)%(bmiheight);


        if(bmi <20){
            System.out.printf("저체중입니다.bmi는 %.2f",bmi);
        }else if(bmi >=20 && bmi <25){
            System.out.printf("정상입니다.bmi는 %.2f",bmi);
        }else if(bmi >=25 && bmi <30){
            System.out.printf("과체중입니다.bmi는 %.2f",bmi);
        }else{
            System.out.printf("비만입니다.bmi는 %.2f",bmi);
        }




    }

}
