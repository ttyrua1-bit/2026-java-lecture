package ch10.exception.ex03;

import java.util.Scanner;

public class Main01 {
    static void main() throws NetworkClientException01 {
        NetworkService01 networkService = new NetworkService01();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
