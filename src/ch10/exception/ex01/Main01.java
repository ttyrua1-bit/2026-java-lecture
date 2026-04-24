package ch10.exception.ex01;

import java.util.Scanner;

public class Main01 {


    static void main() {
        NetworkService01 networkService01 = new NetworkService01();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            networkService01.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
