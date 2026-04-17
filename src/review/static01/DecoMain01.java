package review.static01;

public class DecoMain01 {
    static void main() {
        String str01 = "hello java";
        DecoUtil decoUtil = new DecoUtil();
        String decoStr01 = decoUtil.deco(str01);
        System.out.println(decoStr01);


        //메서드에도 static을 쓸 수 있다.
        //이때 instance를 생성해서 static method를 쓰는 경우는 거의 없다
        //보통 Class.staticMethod()를 바로 사용한다.
        String decoStr02 = DecoUtil.deco("hello python");
        System.out.println(decoStr02);
    }
}
