package NotionTest;

public class Review {
    static void main() {
        boolean isTrue = true;
        boolean isBig = 5 > 3;
        boolean isLogical = 5 > 3 || 10 < 5;
        String userID = "Leejaeheon";
        String userPW = "1234";

        if(isLogical){
            System.out.println("참일때 출력");
        }

        if(userID == "Leejaeheon"  && userPW == "1234"){
            System.out.println("로그인 성공");
        }


        int grade = 1;
        switch(grade){
            //정수 문자열 문자 실수X
            case 1:
                System.out.println("1등급 소고기 한근에 30000");
                break;
            case 2:
                System.out.println("2등급 소고기 한근에 20000");
                break;
            case 3:
                System.out.println("3등급 소고기 한근에 16000");
                break;
            default:
                System.out.println("식용불가");

        }

        String command = "save";
        switch(command){
            case "save" -> System.out.println("저장");
            case "delete"-> System.out.println("삭제");
            case "copy" -> System.out.println("복사");
            default -> System.out.println("잘못된 명령");
        }



    }
}
