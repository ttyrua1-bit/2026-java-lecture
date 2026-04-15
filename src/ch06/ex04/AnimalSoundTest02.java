package ch06.ex04;

public class AnimalSoundTest02 {

    static void soundAnimal(Animal animal) {

        System.out.println(Animal.MY_PI);
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 끝");
    }

    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
//        Animal [] animals = new Animal[3];
//        animals[0] = dog;
//        animals[1] = cat;
//        animals[2] = caw;
        Animal[] animals = {dog,cat,caw};

        for(Animal animal:animals) {
            soundAnimal(animal);
        }
    }


}
