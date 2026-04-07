package ch02;

import java.time.LocalDate;

public class SwitchTest02 {
    static void main() {
        int month = 7;
        String season = null;

        season = switch(month){
            case 12,1,2 ->     //  break 줄이려면 -> 사용
                //System.out.println("겨울");
                //season="겨울";
            {
                yield "겨울";//yield쓰려면 중괄호안에 있어야한다. 한줄이면 yield도 생략가능 중괄호도
            }
            case 3,4,5 ->
                //System.out.println("봄");
                //season = "봄";
            {
                yield "봄";
            }
            case 10,11 ->
                //System.out.println("가을");
                //season = "가을";
            {
                yield "가을";
            }
            case 6,7,8,9 ->
                //System.out.println("여름");
                //season = "여름";
            {
                yield "여름";
            }
            default ->
                //System.out.println("잘못된 월입니다.");
            {
                yield "잘못된 월입니다.";
            }
        };                //식이 되었기때문에 값이기때문에 ;을 찍어야한다.
        // 식으로 쓰려면 default가 반드시 필요하다.
        System.out.println(season);


        //LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2027,4,7);
        System.out.println(today);
        System.out.println(today.getDayOfWeek().getValue());
        int day = today.getDayOfWeek().getValue();



        //int day=2;
        switch(day){
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("해당하는 요일이 없습니다.");
        }   //값으로 귀결되면 식 값으로 귀결되지 않으면 문이다.

        //enhanced switch   향상된 스위치문
        switch(day){
            case 1 -> System.out.println("월요일");

            case 2 -> System.out.println("화요일");

            case 3 -> System.out.println("수요일");

            case 4 -> System.out.println("목요일");

            case 5 -> System.out.println("금요일");

            case 6-> System.out.println("토요일");

            case 7 -> System.out.println("일요일");

            default -> System.out.println("해당하는 요일이 없습니다.");
        }



        String yoil = switch(day){
            case 1 -> "월요일";  // 중괄호쓰고 그 안에 yield"월요일" 써야하는데 한줄이면 생략가능하다.
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6-> "토요일";
            case 7 -> "일요일";
            default -> "해당하는 요일이 없습니다.";
        };

        System.out.println(yoil);
    }
}
