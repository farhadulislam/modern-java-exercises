package islam.farhad.exercises.javaFundamentals;

import java.util.*;
import islam.farhad.exercises.javaFundamentals.Student;
import org.w3c.dom.ls.LSOutput;

public class DemoCollectionInterface1 {
    public static void main(String [] args){

        Student s1 = new Student(230, "Puthifar" );
        Student s2 = new Student(231, "Julekha" );
        Student s3 = new Student(232, "Nefartithi" );
        Student s4 = new Student(233, "Yousuf" );
        Student s5 = new Student(235, "Akhanatoon" );
        Student s6 = new Student(533, "Melisabu" );
        Student s7 = new Student(600, "Aggamohor" );

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        studentList.forEach(student -> System.out.println(student.getName()));
        studentList.stream().forEach(s-> System.out.println(s.getName()));// Using Stream API

        //Creating another list, adding all elements from previous list using addAll
        List<islam.farhad.exercises.javaFundamentals.Student> studentList2 = new ArrayList<>();
        studentList.addAll(studentList);
        studentList2.forEach(System.out::println);
        studentList2.removeAll(studentList);
        if(studentList2.isEmpty())
            System.out.println("List is empty");

        //Student list 3
        List<Student> studentList3 = Arrays.asList(s1,s2,s3,s4,s5,s6, s7);
        studentList3.forEach(s-> System.out.println(s.getName()));
        //studentList3.removeIf(student -> student.getName().equals("Aggamohor"));
        //studentList3.forEach(s-> System.out.println(s.getName()));

        //HashMap

        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(111, "abc");
        hashMap1.put(222, "def");
        hashMap1.put(333, "jhk");
        hashMap1.put(444, "mno");

        hashMap1.forEach( (k, v)-> System.out.println(k + " | " + v));
        hashMap1.replaceAll((k, v) -> v.toUpperCase());
        hashMap1.forEach( (k, v)-> System.out.println(k + " | " + v));

        // HasMap - some useful methods to go with
        Map<String, Integer> hashMap2 = new HashMap<>();

        hashMap2.put( "Aziz", 1110);
        hashMap2.put( "Tarik", 2220);
        hashMap2.put( "Abid", 3330);
        hashMap2.put( "Hassan", 4440);

        System.out.println(hashMap2.get("Hassan"));
        System.out.println(hashMap2.containsKey("James"));
        System.out.println(hashMap2.containsValue(1110));

        hashMap2.put("Aziz", 0);
        System.out.println(hashMap2);
        hashMap2.replace("Aziz", 0);
        System.out.println(hashMap2);

        hashMap2.putIfAbsent("Minhaj", 9999);
        System.out.println(hashMap2);

        hashMap1.keySet().forEach(System.out::println);
        hashMap2.values().forEach(System.out::println);



    }
}
