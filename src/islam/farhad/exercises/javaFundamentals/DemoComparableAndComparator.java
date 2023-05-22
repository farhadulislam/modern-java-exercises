package islam.farhad.exercises.javaFundamentals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparableAndComparator {
        static List<islam.farhad.exercises.javaFundamentals.Student> studentList2 = new ArrayList<>();
        static {
            islam.farhad.exercises.javaFundamentals.Student s5 = new islam.farhad.exercises.javaFundamentals.Student(1000, "Johm");
            islam.farhad.exercises.javaFundamentals.Student s6 = new islam.farhad.exercises.javaFundamentals.Student(900, "Alibaba");
            islam.farhad.exercises.javaFundamentals.Student s7 = new islam.farhad.exercises.javaFundamentals.Student(1200, "Zaid");
            islam.farhad.exercises.javaFundamentals.Student s8 = new islam.farhad.exercises.javaFundamentals.Student(3000, "Dory");
            Collections.addAll(studentList2,s5,s6,s7,s8);
        }
    public static void main (String [] args){

        islam.farhad.exercises.javaFundamentals.Student s1 = new islam.farhad.exercises.javaFundamentals.Student(100, "Stian");
        islam.farhad.exercises.javaFundamentals.Student s2 = new islam.farhad.exercises.javaFundamentals.Student(90, "Alan");
        islam.farhad.exercises.javaFundamentals.Student s3 = new islam.farhad.exercises.javaFundamentals.Student(120, "Zahid");
        islam.farhad.exercises.javaFundamentals.Student s4 = new islam.farhad.exercises.javaFundamentals.Student(30, "Cay");

        List<islam.farhad.exercises.javaFundamentals.Student> studentList = Arrays.asList(s1,s2,s3,s4);

        Collections.sort(Collections.unmodifiableList(studentList));
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
