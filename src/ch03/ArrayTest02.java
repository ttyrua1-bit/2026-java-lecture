package ch03;

public class ArrayTest02 {
    static void main() {
        String[] names = new String[3];
        names[0] ="전지현";
        names[1] ="송혜교";
        names[2] ="김태희";

        String [] actors = {"장동건","이병헌","송강호"}; //배열 선언과 동시에 할당

        int []nums ={10,30,27,98,102,121,21212,2121,121,212,2,12,1,214,3,424324,32,4343554,3543};
        int max = nums[0];
        for(int i=0;i< nums.length;i++){
            if(nums[i] >max){
                max = nums[i];
            }
        }
        System.out.println("제일큰숫자는 "+max);

        //enhanced for  ,   for each구문  :순서없이 접근하고싶을때
        for(String actor:actors){
            System.out.println(actor);
        }

        enum Week{월,화,수,목,금,토,일}; // enum 열겨형( 나열하는것)
        //Week.values = [월,화,수,목,금,토,일]      ******
        //System.out.println(Week.values()[0]);   ******

        for(Week day:Week.values()){
            System.out.println(day);
        }

        int [][] intArray = new int[4][2];  //대괄호 두개써야함 1/1,1/2,2/1,2/2...
        intArray[0][0] = 80;
        intArray[0][1] = 80;
        intArray[1][0] = 80;
        intArray[1][1] = 80;
        intArray[2][0] = 80;
        intArray[2][1] = 80;
        intArray[3][0] = 80;
        intArray[3][1] = 80;

        for(int i =0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.println((i+1)+"학년 "+(j+1)+"학기 점수 : "+intArray[i][j]);
            }
        }
        double[][] doubleArray = {{3.7,4.2},{3.9,4.1},{4.25,4.17},{4.1,4.34}}; //선언과동시에 할당하기

        for(int i=0;i< doubleArray.length;i++){
            for(int j=0;j<doubleArray[i].length;j++){
                System.out.println((i + 1)+"학년 "+(j+1)+"학기점수: "+doubleArray[i][j]);
            }
        }
        for(double [] row : doubleArray){
            for(double value:row){
            System.out.print(value+"/");}
        }















    }
}
