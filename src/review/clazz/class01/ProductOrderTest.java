package review.clazz.class01;

public class ProductOrderTest {
    static void main() {
        ProductOrder productOrder01 = new ProductOrder();
        ProductOrder productOrder02 = new ProductOrder();
        ProductOrder productOrder03 = new ProductOrder();
        productOrder01.productName = "두부";
        productOrder01.price = 2000;
        productOrder01.quantity = 2;

        productOrder02.productName = "김치";
        productOrder02.price = 5000;
        productOrder02.quantity = 1;

        productOrder03.productName = "콜라";
        productOrder03.price = 1500;
        productOrder03.quantity = 2;

        ProductOrder [] orders = new ProductOrder[3];
        orders[0] = productOrder01;
        orders[1] = productOrder02;
        orders[2] = productOrder03;
        int totalPrice = 0;
        for(ProductOrder productOrder:orders) {
            System.out.println("상품명: "+productOrder.productName+", 가격:"+productOrder.price+
                    ", 수량:"+ productOrder.quantity);
            totalPrice+=productOrder.price*productOrder.quantity;
        }
        System.out.println("총 결제 금액 : "+totalPrice);
    }
}
