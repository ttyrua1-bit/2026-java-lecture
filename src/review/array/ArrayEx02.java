package review.array;

import java.util.Scanner;

public class ArrayEx02 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int num=0;
        String[] title = new String[5];
        int[] price = new int[5];

        int count = 0;



        while(true){
            System.out.println("1.상품등록|2.상품목록|3.종료");
            System.out.print("메뉴를 선택하세요:");
            num = scanner.nextInt();

            if(num == 1){

                System.out.print("상품 이름을 입력하세요: ");
                title[count] = scanner.next();
                System.out.print("상품 가격을 입력하세요: ");
                price[count] = scanner.nextInt();

                count++;

            }
            if(num==2){

                if(count == 0){
                    System.out.println("입력된 제품이 없습니다.");
                    continue;
                }

                for(int i = 0; i<count; i++){
                    System.out.println(title[i]+": "+price[i]);
                }

            }
            if(num ==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }



        }






    }


}
