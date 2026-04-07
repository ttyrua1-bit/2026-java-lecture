package ch02;

public class SwitchTest {
    static void main() {
        //switch는 조건을 쓰는 다른 방법
        String order ="아이스아메리카노";
        switch(order){
            case "아이스아메리카노":     //  case 뒤에는 정수,문자,문자열만 쓸수있다.
                System.out.println("2000원 입니다.");
                break;
            case "카라멜마끼아또":
                System.out.println("4500원 입니다.");
                break;
            case "카페모카":
                System.out.println("5000원 입니다.");
                break;
            default:
                System.out.println("해당메뉴는 없습니다.");
        }

        int score = 71;
        switch(score/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("불합격");


        }
        int month = 7;
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("여름");
        }















    }
}
