package ch08.test;

public enum Transport {
    BUS(1200),SUBWAY(1400),TAXI(4800);
    private final int fare;

    Transport(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }


}
