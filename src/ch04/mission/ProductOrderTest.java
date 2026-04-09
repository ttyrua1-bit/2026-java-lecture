package ch04.mission;

public class ProductOrderTest {
    static void main() {


        ProductOrder product01 = new ProductOrder();
        product01.productName = "사과한박스";
        product01.price = 12000;
        product01.quantity = 3;

        ProductOrder product02 = new ProductOrder();
        product02.productName = "포도주스한박스";
        product02.price = 9000;
        product02.quantity = 2;

        ProductOrder product03 = new ProductOrder();
        product03.productName = "반창고 1각";
        product03.price = 3000;
        product03.quantity = 3;

        ProductOrder product04 = new ProductOrder();
        product04.productName = "비타민C음료수";
        product04.price= 1000;
        product04.quantity = 3;

        ProductOrder product05 = new ProductOrder();
        product05.productName = "아날로그시계";
        product05.price = 25000;
        product05.quantity = 1;

        ProductOrder [] orders = new ProductOrder[5];
        orders[0] = product01;
        orders[1] = product02;
        orders[2] = product03;
        orders[3] = product04;
        orders[4] = product05;

        //또는
        //ProductOrder [] orders = {product01,product02,product03,product04,product05};



        int totalprice=0;
//        for(int i=0;i< orders.length;i++){
//            System.out.println("상품명은 "+ orders[i].productName+"입니다.");
//            System.out.println("가격은 "+orders[i].price+"원입니다. ");
//            System.out.println("구매하실 개수는 "+ orders[i].quantity+"입니다.");
//            System.out.println("-----------------------------");
//
//        }
        for(ProductOrder order:orders){
            System.out.println("상품명: "+order.productName);
            totalprice += order.price*order.quantity;
        }
        System.out.println("총금액: "+totalprice);



    }



}
