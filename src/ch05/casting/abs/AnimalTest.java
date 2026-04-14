package ch05.casting.abs;

public class AnimalTest {

    static void soundAnimal(Animal animal) {
        //속성은 overridding이 되지 않는다.
        // 메서드만 overring된다.
        System.out.println(animal.value);
        animal.sound();
    }
    static void main() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        Chicken chicken = new Chicken();
        Pig pig = new Pig();



        //추상클래스는 실체 즉 instance를 만들 수 없다.
        //Animal animal = new Animal();_



        int [] arr = {1,2,3,4};
        Animal[] animalArray = {cat,dog,caw,chicken,pig};
        for(Animal animal : animalArray) {
            //System.out.println(animal.value);
            animal.sound();
        }
//        soundAnimal(cat);
//        soundAnimal(dog);
//        soundAnimal(caw);
//        soundAnimal(chicken);


    }


}
