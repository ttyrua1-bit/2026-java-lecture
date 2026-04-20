package ch07.lang.string;

public class StringChangeTest02 {
    static void main() {
        String str = "      Java Programming ";
        System.out.println("소문자로 변환 : "+str.toLowerCase());
        System.out.println("대문자로 변환 : "+str.toUpperCase());
        System.out.println("공백제거(trim) : "+str.trim()+"!");
        System.out.println("공백제거(strip) : "+str.strip()+"!");  //특수문자 공백도 제거....
        System.out.println("앞공백제거(stripLeading() : "+str.stripLeading()+"!");  //특수문자 공백도 제거....
        System.out.println("뒷공백제거(stripTrailing() : "+str.stripTrailing()+"!");  //특수문자 공백도 제거....
        String blankStr = "\u2003Java\u2003";
        System.out.println("["+blankStr+"]");
        System.out.println("["+blankStr.trim()+"]");
        System.out.println("["+blankStr.strip()+"]");
        System.out.println("["+blankStr.strip()+"]");






    }
}
