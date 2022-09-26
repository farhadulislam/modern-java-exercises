package islam.farhad.exercises.commonTools;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String ... args){

        //ScannerDemo();
        //DivisionDemo();
        //MathDemo();
        //RandomDemo();
        //OldFashionedArrayDemo();
        TwoDimenArrayDemo();

    }

    private static void ScannerDemo(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
    }

    private static void DivisionDemo(){

         int items = 10;
         int people = 3;
         int result = items/3;
         System.out.println(result);
         // Result will be 3 instead of 3.33 because int cant hold floating values so it truncates.
         // We can type cast the result (double)nominator/denominator. Look below.
         double itemsPerPerson = (double)items/people;
         System.out.println(itemsPerPerson);
        }

        private static void MathDemo(){

            double x = 3.14;
            double y = 10;
            double max = Math.max(x, y);
            double min = Math.min(x, y);
            double abs = Math.abs(x);
            double sqrt = Math.sqrt(y);
            double round = Math.round(x);
            double ceil = Math.ceil(x);
            double floor = Math.floor(x);

            System.out.println("Find hypotenuse");
            double a = 5;
            double b =  6.0;
            double h = Math.sqrt(a*a + b*b);
            System.out.println("Hypotenuse of a, b is " + h);

        }
        private static void RandomDemo(){

            Random random = new Random();
            int x = random.nextInt(6)+1;// We want to get a value between 1 and 6
            double y = random.nextDouble();
            boolean z = random.nextBoolean();
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

        }

        private static void OldFashionedArrayDemo(){

            String [] cities = {"Chiitagong", "Rajshahi", "Bogura", "Magura", "lalmonirhar"};
            for(int i = 0; i<cities.length; i++){
                System.out.println(cities[i]);
            }


            String [] districts = new String [64];
            districts[0] = "Dhaka";
            districts[1] = "Chandpur";
            districts[2] = "Sirajganj";
            for(int i = 0; i<3; i++){
                System.out.println(districts[i]);
            }

        }

    private static void TwoDimenArrayDemo(){

        String [][] actors = new String[3][3];
        actors[0][0] = "Tushi";
        actors[0][1] = "Mehzabien";
        actors[0][2] = "Safa";
        actors[1][0] = "Afran";
        actors[1][1] = "Apurbo ";
        actors[1][2] = "Zovan";
        actors[2][0] = "Ashfaq Nipun";
        actors[2][1] = "Omi";
        actors[2][2] = "Vicky";

        String [][] actors2 = {
                {"Tasnia", "Tanjin", "Salha Khanom"},
                {"Tousif", "Khairul", "Mosharraf"},
                {"MK Raaj", "Shafayet", "Choyonika"},

        };

        System.out.println(actors.length);
        for (int i = 0; i< actors.length; i++){
            System.out.println();
            for(int j=0; j<actors[i].length; j++) System.out.print(actors[i][j] + " ");
        }

        for (int i = 0; i< actors2.length; i++){
            System.out.println();
            for(int j=0; j<actors2[i].length; j++) System.out.print(actors2[i][j] + " ");
        }

    }
}
