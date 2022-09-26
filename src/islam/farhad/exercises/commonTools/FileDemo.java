package islam.farhad.exercises.commonTools;

import java.io.File;

public class FileDemo {
    public static void main (String ... args){

        System.out.println("File Demo");

        File file1 = new File("file.txt");

        if(file1.exists()){
            System.out.println("File exists");
            System.out.println(file1.getPath());
            System.out.println(file1.getAbsoluteFile());
            System.out.println(file1.isFile());
            file1.delete();
        }else{
            System.out.println("File doesn't exists! ");
        }

    }
}
