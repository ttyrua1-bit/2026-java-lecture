package notion417.pointclassNotion;

public class ColorPoint extends Point{
    String color;
    int x;
    int y;



    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
        this.x=x;
        this.y=y;

    }

    void setXY(int x,int y){
        this.x = x;
        this.y = y;

    }

    void setColor(String color){
        this.color = color;
    }






}
