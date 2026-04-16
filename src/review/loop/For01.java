package review.loop;

public class For01 {
    static void main() {
        int sum=0;
        for(int i=1;i<=10;i++) {
            sum+=i;
        }
        System.out.println(sum);
        for(int i=0;i<2;i++) {
            System.out.println("외부 for 시작 i : "+i);
            for(int j=0;j<3;j++) {
                System.out.println("내부 for 시작 i : "+i+" j : "+j);
            }
            System.out.println("외부 for 종료  i : "+i);
            System.out.println("");
        }
    }


}
