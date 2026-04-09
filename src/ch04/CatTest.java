package ch04;

public class CatTest {
    static void main() {

        Cat cat01 = new Cat();   //인스턴스, 오브젝트 라고도 부른다.
        cat01.name = "러블리";
        cat01.age = 3;    // .찍어서 접근 하거나
        // cat01["age"] = 4  이렇게 해도 됨.

        Cat cat02 = new Cat();
        cat02.name = "야옹이";
        cat02.age = 4;

        Cat cat03 = cat01;
        System.out.println(cat01);
        System.out.println(cat02);
        System.out.println(cat03);

        Cat [] cats = new Cat[2];
        //cats[0] = new Cat(); // 또는 cat01을 넣어도됨
        cats[0] = cat01; // 배열은 반복문으로 쓸수있다.
        cats[1] = cat02;

        for(int i=0;i< cats.length;i++){
            System.out.println(cats[i].name);
            System.out.println(cats[i].age);
        }

    }

}
