package ch03.answer;
import java.util.Scanner;

public class Answer0204 {
    static void main() {
        Scanner scanner = new Scanner(System.in);



        //영어 소문자 아스키코드 97~122
        System.out.print("소문자 알파벳 하나를 입력하시오");
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);

        if(n<97 || n >122){
            System.out.println("잘못된입력입니다.");
            return;
        }

        for(int i=96;i<n;i++){
            for(int j=n-i; j>0; j-- ){
                System.out.print(Integer.toString(n-(j-1)));
            }
            System.out.println();
        }



    }

}
