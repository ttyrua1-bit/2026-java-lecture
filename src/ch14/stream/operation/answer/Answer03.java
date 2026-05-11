package ch14.stream.operation.answer;

import java.util.List;

public class Answer03 {
    static void main() {
        List<Product> products=List.of(
                new Product("노트북",1500000),
                new Product("마우스",30000),
                new Product("키보드",80000),
                new Product("모니터",300000)
        );
        double avg = products.stream().mapToDouble(Product::getPrice)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}