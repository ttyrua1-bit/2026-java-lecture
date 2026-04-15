package ch06.car02;

public class Sonata implements Car{
    public void startEngine(){
        System.out.println("Sonata.startEngine");
    }
    public void offEngine(){
        System.out.println("Sonata.offEngine");
    }

    public void pressAccelerator() {
        System.out.println("Sonata.pressAccelerator");
    }

}
