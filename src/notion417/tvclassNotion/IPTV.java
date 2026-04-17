package notion417.tvclassNotion;

public class IPTV extends ColorTV{
    String address;
    int size;
    int color;

    public IPTV(String address, int size, int color) {
        super(size, color);
        this.address = address;
        this.size = size;
        this.color = color;

    }
    void printProperty(){
        System.out.println("나의 IPTV는 "+address+"주소의 "+ size+"인치 "+color+"컬러");
    }



}
