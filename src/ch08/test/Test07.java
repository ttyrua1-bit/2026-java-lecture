package ch08.test;

public class Test07 {
    static void main() {
        Transport transport = Transport.BUS;
        System.out.println(transport.name()+"의 기본 요금은 " + transport.getFare()+"원");
        Transport [] transports = Transport.values();
        for(Transport trans : transports){
            System.out.println(trans.name()+"의 기본 요금은 "+trans.getFare()+"원");
        }
    }
}
