package ch07.lang.string;

public class StringBuilderTest01 {
    //    String str = "A"+"B"+"C"+"D"; //불변객체
    //    String str = String("A")+String("B")+String("C")+String("D")
    //    String str = String("AB")+String("C")+String("D")
    //    String str = String("ABC")+String("D")
    //    String str = String("ABCD")
    static void main() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        System.out.println("stringBuilder = "+stringBuilder);
        stringBuilder.insert(4,"Java");
        System.out.println("stringBuilder = "+stringBuilder); //가변객체라서 객체를 하나만 생성
        stringBuilder.delete(4,8);
        System.out.println("stringBuilder = "+stringBuilder); //가변객체라서 객체를 하나만 생성
        stringBuilder.reverse();
        System.out.println("stringBuilder = "+stringBuilder); //가변객체라서 객체를 하나만 생성
        String str = stringBuilder.toString(); //불변객체인 String으로 변환
    }





}
