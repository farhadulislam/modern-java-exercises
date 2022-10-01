package islam.farhad.exercises.javaFundamentals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparableAndComparator {
        static List<Student> studentList2 = new ArrayList<>();
        static {
            Student s5 = new Student(1000, "Johm");
            Student s6 = new Student(900, "Alibaba");
            Student s7 = new Student(1200, "Zaid");
            Student s8 = new Student(3000, "Dory");
            Collections.addAll(studentList2,s5,s6,s7,s8);
        }
    public static void main (String [] args){

        Student s1 = new Student(100, "Stian");
        Student s2 = new Student(90, "Alan");
        Student s3 = new Student(120, "Zahid");
        Student s4 = new Student(30, "Cay");

        List<Student> studentList = Arrays.asList(s1,s2,s3,s4);

        Collections.sort(studentList);
        // Here, we are using Comparable<T> interface which is used for single sorting
        // The overriden compareTo() method sorts based on student id, if we were to sort based on
        // student name, for example, we would have to write another implementation of compareTo()
        //Hence, Comparable interface implementation is hard-coded.

        /* Now, look below for Comparator Interface Implementation */

        //Collections.sort(studentList, new IdComparator());
        //Collections.sort(studentList, new NameComparator());
        studentList.stream().forEach(System.out::println);

        Collections.sort(studentList2);
        studentList2.stream().forEach(System.out::println);

    }

    
}
