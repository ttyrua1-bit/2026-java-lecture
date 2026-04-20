package ch07.lang.NotionTest;

public class Test07 {

    static void main() {

        String str = "aaabbccccdaa";
        int count = 1;
        char c;
        
        for(int i=0;i<str.length()+1;i++){
            if(str.charAt(i) == str.charAt(i+1)){

                count++;
            }
            else{
                c = str.charAt(i);
                System.out.printf("%c%d",c,count);
                count = 1;
            }

            
        }





    }




}
