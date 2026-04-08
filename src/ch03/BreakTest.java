package ch03;
import java.util.Scanner;

public class BreakTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("and를 쓰면 종료합니다.");
        while(true) {
            System.out.println("채팅 ===>");
            String msg = scanner.nextLine();
            if (msg.equals("end")) {
                break;
            }
            System.out.println(msg);
        }
        System.out.println("채팅종료");
    }

}
