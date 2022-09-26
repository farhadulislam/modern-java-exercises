package islam.farhad.exercises.commonTools;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main (String ... args)  {

    System.out.println("File Writer Demo");
       try {
           FileWriter fileWriter1 = new FileWriter("shopping_list.txt");
           fileWriter1.write("rice 10KG \nflour 2 KG\neggs 1 dozens\n");
           fileWriter1.append("");
           fileWriter1.close();
       }
       catch(IOException e){
           e.printStackTrace();
       }

    }
}
