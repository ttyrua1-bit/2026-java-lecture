package notion417.converterNotion;

import java.sql.SQLOutput;
import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double srs);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.println("바꾸고 싶은 "+getSrcString()+"를 입력하세요 >>");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다.");
        sc.close();

    }



}
