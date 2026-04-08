package NotionTest;
import java.util.Scanner;

public class Testall07 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달을 입력하세요.");
        int month = scanner.nextInt();

        switch(month) {
            case 12,1,2-> System.out.println("겨울");
            case 3,4,5 -> System.out.println("봄");
            case 6,7,8,9 -> System.out.println("여름");
            case 10,11 -> System.out.println("가을");
            default -> System.out.println("잘못입력함");
        }

//        if(month >=3 && month <=5){
//            System.out.println("봄");
//        }else if(month >=6 && month <=8){
//            System.out.println("여름");
//        }else if(month >=9 && month <=11){
//            System.out.println("가을");
//        }else if(month ==12 || month ==1 || month==2){
//            System.out.println("겨울");
//        }else{
//            System.out.println("잘못된 입력입니다.");}





    }
}
