package review.condition;

public class if01 {
    static void main() {
        int age = 20;
        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        if (age <= 7) {
            System.out.println("미취학아동");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등아동");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
        // 7세 이하 미취학 아동
        // 8세 이상 13세 이하 초등학생
        // 14세 이상 16세 이하 중학생
        // 17세 이상 19세 이하 고등학생
        // 나머지 성인

        //가격 10000원
        //만원이상이면 1000원 할인
        //나이가 10이하이면 1000원 할인
        int price = 10000;
        int discount=0;
        int age02= 10;
        if(price>=10000) {
            discount+=1000;
        }
        if(age02<=10) {
            discount+=1000;
        }
        int result = price-discount;
        System.out.println(result);

    }


}
