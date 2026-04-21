package ch07.lang.string;

public class StringFormat {

    static void main() {
        //System.out.printf();
        String name = "홍길동";
        int age = 20;
        double score = 96.5;
        String result = String.format("이름 : [%10s],나이 : %05d, 점수 : %.1f",name,age,score);
        String result02 = String.format("이름 : [%-10s],나이 : %d, 점수 : %.1f",name,age,score);
        String result03 = "이름 : [%-10s],나이 : %d, 점수 : %.1f".formatted(name,age,score);
        String html = """
            <div>
                <h1>%s</h1>
                <p>점수 : %.2f</p>
            </div>
        """.formatted(name,score);
        //sql
        System.out.println(result);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(html);
    }


}
