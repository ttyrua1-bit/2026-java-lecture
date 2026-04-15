package ch06.car02;

public class Genesis implements Car{

    @Override
    public void startEngine() {
        System.out.println("Genesis.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Genesis.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Genesis.pressAccelerator");
    }

}
