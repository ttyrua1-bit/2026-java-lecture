package ch12.member;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    //private static final MemberRepository memberRepository = new MemoryMemberRepository();
    //private static final MemberRepository memberRepository = new FileMemberRepository();
    //private static final MemberRepository memberRepository = new DataMemberRepository();
    private static final MemberRepository memberRepository = new ObjectMemberRepository();
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원등록 / 2. 회원목록 조회 / 3. 종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    signup(scanner);
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }

    private static void showAll() {
        List<Member> members = memberRepository.findAll();
        System.out.println("회원 목록 : ");
        for(Member member:members){
            System.out.printf("[ID : %s , Name : %s , Age : %d]\n",member.getId(), member.getName(), member.getAge());
        }
    }

    private static void signup(Scanner scanner) {
        System.out.print("ID 입력 : ");
        String id =  scanner.nextLine();
        System.out.print("Name 입력 : ");
        String name = scanner.nextLine();
        System.out.print("Age 입력 : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Member member = new Member(id,name,age);
        memberRepository.add(member);
    }
}
