package islam.farhad.exercises.javaFundamentals.SerializationDeserilization;

import islam.farhad.exercises.data.Student;

import java.io.*;

public class Demo_SerializationDeserialization_01 {

    private static final String fileToWriteAndReadSerializedDate = "serialized.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write
        Student student1 = new Student(100, "Tom");
        FileOutputStream f1 = new FileOutputStream(fileToWriteAndReadSerializedDate);
        ObjectOutputStream o1 = new ObjectOutputStream(f1);

        o1.writeObject(student1);
        o1.flush();
        o1.close();

        //read

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream(fileToWriteAndReadSerializedDate));
        Student student1_deserialized = (Student)objectInputStream1.readObject();
        System.out.println(student1_deserialized.getName());


    }
}
