package review.static01;

public class DataCountTest03 {
    static void main() {
        Data03 data01 = new Data03("data01");
        System.out.println("data01 count = "+Data03.count);
        Data03 data02 = new Data03("data02");
        System.out.println("data02 count = "+Data03.count);
        Data03 data03 = new Data03("data03");
        System.out.println("data02 count = "+Data03.count);
    }
}
