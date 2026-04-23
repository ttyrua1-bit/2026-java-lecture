package ch00Test;

import java.util.Scanner;

public class NotionTest {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리 정수 입력(10~99) >>");
        int num = scanner.nextInt();


        if(num/10 == num%10){
            System.out.println("Yes!10의자리와 1의 자리가 같습니다.");
        }
        else{
            System.out.println("No!10의자리와 1의자리가 다릅니다.");
        }



    }



}
