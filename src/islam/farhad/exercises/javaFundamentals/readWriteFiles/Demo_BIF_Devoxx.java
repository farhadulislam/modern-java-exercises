package islam.farhad.exercises.javaFundamentals.readWriteFiles;

import java.io.*;

public class Demo_BIF_Devoxx {
    public static void main(String[] args) throws IOException {
        readFile();


    }

    private static void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( new FileInputStream("islam/farhad/exercises/commonTools/file.txt")));
        try(BufferedReader bufferedReader2 = bufferedReader){
            String line;
            while((line = bufferedReader2.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException io){

        }
    }
}
