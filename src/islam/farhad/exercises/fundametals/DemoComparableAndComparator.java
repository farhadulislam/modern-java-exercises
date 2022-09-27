package islam.farhad.exercises.fundametals;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparableAndComparator {

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
        //Collections.sort(studentList, new IdComparator());
        //Collections.sort(studentList, new NameComparator());
        studentList.stream().forEach(System.out::println);

    }

    
}
