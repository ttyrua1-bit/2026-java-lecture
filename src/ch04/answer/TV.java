package ch04.answer;

public class TV {
    String brand;
    int size;
    int volume;
    int sum_volume;


    TV(String brand,int size,int volume) {
        this.brand = brand;
        this.size = size;
        this.volume = volume;
        sum_volume = volume;
    }

    void turnOn(){
        System.out.println("TV전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("TV전원을 끕니다.");
    }

    void volumeUp(){

        if(sum_volume == 100){
            sum_volume +=0;
        }
        else {
            sum_volume += 1;
        }
        System.out.println("볼륨: "+sum_volume);
    }
    void volumeDown(){
        if(sum_volume == 0){
            sum_volume -= 0;
        }else{
            sum_volume -= 1;
        }
        System.out.println("볼륨: "+sum_volume);
    }







}
