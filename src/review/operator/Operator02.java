package review.operator;

public class Operator02 {

    static void main() {
        int sum = 1 + 2 * 3;
        System.out.println(sum);
        int sum02 = (1+2)*3;
        System.out.println(sum02);
        int num= 0;
        num = num + 1;  //num = 1
        num++;          //num=2;
        System.out.println(num);
        int temp = num++;
        System.out.println("temp = "+temp+" / num = "+num);
        temp = ++num;
        System.out.println("temp = "+temp+" / num = "+num);
    }
}
