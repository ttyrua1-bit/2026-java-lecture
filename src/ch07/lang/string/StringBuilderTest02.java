package ch07.lang.string;

public class StringBuilderTest02 {
    static void main() {
        long startTime = System.currentTimeMillis(); //1000/1

        String result = "";
        for(int i=0;i<100000;i++) {
            result+="hello java";
        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i=0;i<10000;i++) {
//            stringBuilder.append("hello java");
//        }
//        String result = stringBuilder.toString();
        long endTime = System.currentTimeMillis(); //1000/1
        System.out.println("result = "+result);
        System.out.println("time = "+(endTime-startTime));
        StringBuilder stringBuilder02 = new StringBuilder();
        stringBuilder02.append("a")
                .append("b")
                .append("c")
                .reverse();
        System.out.println(stringBuilder02);

    }


}
