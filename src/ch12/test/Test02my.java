package ch12.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02my {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try(FileWriter fw = new FileWriter("diary.txt",true)){

            while(true){
                String line = sc.nextLine();

                if(line.equals("exit")){
                    break;
                }

                fw.write(line+"\n");
            }
            System.out.println("저장 완료!");
        }catch(IOException e){
            e.printStackTrace();
        }

        sc.close();


    }
}
