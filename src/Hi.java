public class Hi {
    public static int sum(int x, int y){
        //강타입 언어(자바) 약타입 언어
        //int num = 10;     type을 붙여줘야한다.
        return x+y;

    }
    static void main(){
        System.out.println(sum(12,32));
        int num = 10;   //정수 리터럴
        String name = "이재헌";  //문자열 리터럴
        char c = 'a';     //문자 리터럴
        System.out.println(num*2);
    }
}
