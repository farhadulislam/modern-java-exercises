package islam.farhad.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DemoCoreJava8 {

    public static void main(String [] args){

      /*  demoLoop();
        demo();*/
        demoSwitch();
        demoArray();
        isLeapYear(1985);
        System.out.println(isLeapYear(1985));
        demoIterator();
        demoUserInput();

    }

    public static void demoUserInput(){

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s2 = br.readLine();
            System.out.println(s2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
     public static void demoIterator(){

        List<Integer> nums = List.of(1,2,3,4,5,6);
        System.out.println("Using enhanced for-loop");
        nums.forEach(System.out::println);

         System.out.println("Using Iterator");
         Iterator<Integer> iterator = nums.iterator();
         while(iterator.hasNext()){
             System.out.println(iterator.next());
         }

         System.out.println(" ");
         System.out.println("Using list iterator");
         ListIterator<Integer> listIterator = nums.listIterator();
         listIterator.forEachRemaining(System.out::println);

         System.out.println("Using Stream API");
         nums.stream().forEach(System.out::println);


     }

    public static void demo(){

        StringBuilder sb = new StringBuilder("Some Strings");
        sb.append(", more strings");

        System.out.println(sb.toString());

        // prefix and postfix

        int number1 = 5;
        ++number1;
        System.out.println(number1);

        int number2 = 5;
        number2++;
        System.out.println(number2);


    }

    public static void demoLoop(){

        for(int i=0;i<10; i++){
            for(int j=0; j<i; j++)
                System.out.println(i + " "+ j);
        }
    }

    public static void demoSwitch(){

        List<String> listOfMonth = new ArrayList<>();

        int month = 3;

        switch(month){
            case 1 : listOfMonth.add("January");
                break;
            case 2 : listOfMonth.add("February");
                break;
            case 3: listOfMonth.add("March");
                break;
            case 4 : listOfMonth.add("April");
                break;
            case 5 : listOfMonth.add("May");
                break;
            case 6 : listOfMonth.add("June");
                break;
            case 7 : listOfMonth.add("July");
                break;
            default : break;
        }

        if (listOfMonth.isEmpty()) {
            System.out.println("List of month is empty");
        }
        else{

            for ( String s : listOfMonth){

                System.out.println(s);
            }

            }
        }

        private static Boolean isLeapYear(int year){
               if (((year % 4 == 0) &&
                    !(year % 100 == 0))
                    || (year % 400 == 0))
                   return Boolean.TRUE;
               else
                   return Boolean.FALSE;
        }
        private static void demoArray(){

            byte[] anArrayOfBytes;
            short[] anArrayOfShorts;
            long[] anArrayOfLongs;
            float[] anArrayOfFloats;
            double[] anArrayOfDoubles;
            boolean[] anArrayOfBooleans;
            char[] anArrayOfChars;
            String[] anArrayOfStrings;

            int [] arrayOfIntergers = new int [5];
            arrayOfIntergers[0] = 23;
            arrayOfIntergers[1] = 43;
            arrayOfIntergers[2] = 54;
            arrayOfIntergers[3] = 71;

            for (int i : arrayOfIntergers){
                System.out.println(i);
            }
        }
    }



