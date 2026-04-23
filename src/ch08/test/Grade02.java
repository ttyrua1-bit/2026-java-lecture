package ch08.test;

public enum Grade02 {
    BASIC(10),GOLD(20),DIAMOND(30);
    private final int discount;
    //생성자 주입 방식
    Grade02(int discount) {
        this.discount = discount;
    }
    public int getDiscount() {
        return discount;
    }
}
