package islam.farhad.exercises.java8generics;

import islam.farhad.exercises.java8record.Employee;

public class GenericsDemo {
    public static void main(String[] args) {
        Employee employeeFarhad = new Employee("DemoGenerics", "Demo");
        print(employeeFarhad,  2025);
        printAnything("Generic method");
        printAnything(23.01);
        printAnything(employeeFarhad.toString());
    }

    private static <T, S> void  print(T t, S s) {
        System.out.println(t);
        System.out.println(s);
    }

    private static <T, S> T  getAnEmployee(T t, S s) {
        System.out.println(t);
        System.out.println(s);
        return t;
    }

    private static <T> void printAnything(T t) {
        System.out.println(t);
    }

//    private static <? extends Number> T printAnything(T t) {
//        //System.out.println(t);
//        return t;
//    }
}
