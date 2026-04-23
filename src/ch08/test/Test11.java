package ch08.test;

import java.util.Scanner;

public class Test11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("권한을 입력하세요. (ADMIN,MANAGER,GUEST) : ");
        String input = scanner.nextLine();
        try {
            Role02 role02 = Role02.valueOf(input.toUpperCase());
            System.out.println("권한명 : " + role02.getTitle());
            System.out.println("권한레벨 : " + role02.getLevel());
            switch (role02) {
                case ADMIN:
                    System.out.println("관리자 입니다.");
                    System.out.println("회원 관리/ 상품 관리/ 통계 관리 가능");
                    break;
                case MANAGER:
                    System.out.println("매니저 입니다.");
                    System.out.println("상품 관리");
                    break;
                case GUEST:
                    System.out.println("게스트 입니다.");
                    System.out.println("조회만 가능");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 권한입니다.");
        }
    }

}
