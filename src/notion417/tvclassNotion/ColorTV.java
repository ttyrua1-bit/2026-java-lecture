package notion417.tvclassNotion;

public class ColorTV extends TV{

    int color;
    int size;


    public ColorTV(int size,int color){
        super(size); //알아보기
        this.size = size;
        this.color =color;
    }

    void printProperty(){
        System.out.println(size+"인치 "+color+"컬러");
    }

}
