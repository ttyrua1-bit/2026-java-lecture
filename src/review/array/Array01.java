package review.array;

public class Array01 {
    static void main() {
        int student01 = 10;
        int student02 = 20;
        int student03 = 30;
        int student04 = 40;
        int student05 = 50;
        int student06 = 60;

        int [] students= new int[6];
        students[0]=10;
        students[1]=20;
        students[2]=30;
        students[3]=40;
        students[4]=50;
        students[5]=60;
        int [] scores = {100,200,300,400};
        for(int i=0;i<6;i++){
            System.out.println(students[i]);
        }
    }

}
