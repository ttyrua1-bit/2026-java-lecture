package ch06.pay;

public class PayTest {

    static void main() {
        PayService payService = new PayService();
        String payOption01 = "kakao";
        int amount01 = 100000;
        payService.processPay(payOption01,amount01);

        String payOption02 = "naver";
        int amount02 = 150000;
        payService.processPay(payOption02,amount02);

        String payOption03 = "toss";
        int amount03 = 250000;
        payService.processPay(payOption03,amount03);
    }

}
