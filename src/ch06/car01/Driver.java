package ch06.car01;

public class Driver {

    private Sonata sonata;
    private Sorento sorento;

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    public void setSorento(Sorento sorento) {
        this.sorento = sorento;
    }


    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if(sonata!=null) {
            sonata.startEngine();
            sonata.pressAccelerator();
            sonata.offEngine();
        } else if(sorento!=null) {
            sorento.startEngine();
            sorento.pressAccelerator();
            sorento.offEngine();
        }
    }


}
