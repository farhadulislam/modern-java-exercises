package islam.farhad.exercises.commonTools;

import java.io.*;

public class BufferedWriterReaderDemo {

    public static void main (String [] args){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("buffered_file.txt"));
            writer.write("This is a file created by BufferedWriter\nThis is second line");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        try{
            BufferedReader reader = new BufferedReader(new FileReader("buffered_file.txt"));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(line);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
