package islam.farhad.exercises.javaFundamentals.readWriteFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//5:17
public class FileReaderDemo {
    public static void main (String ... args)  {

        System.out.println("File Reader Demo");
        try {
            FileReader fileReader1 = new FileReader("shopping_list.txt");
            int data = fileReader1.read(); // returns -1 if there's no more data to be read
            while(data != -1){
                System.out.print((char)data);
                data = fileReader1.read();
            }

            fileReader1.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
