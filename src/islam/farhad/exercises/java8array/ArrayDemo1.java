package islam.farhad.exercises.java8array;

public class ArrayDemo1 {

    public static void main(String[] args) {

        String [][] newArray = new String[2][2];
        newArray[0][0] = "Bangladesh";
        newArray[0][1] = "UAE";
        newArray[1][0] = "Malaysia";
        newArray[1][1] = "Qatar";
        System.out.println(newArray.length);
     print2dArray(newArray, 2, 2);
    }

    private static void print2dArray(String [][] newArray, int rows, int columns){


        for (int i = 0; i < rows; i++) {
            for (int j =0; j <columns; j++){
                System.out.print(newArray[i][j] + " ");
            }
                System.out.println();
        }


    }
}
