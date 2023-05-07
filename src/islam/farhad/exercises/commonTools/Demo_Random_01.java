package islam.farhad.exercises.commonTools;

import java.util.Random;

public class Demo_Random_01 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = random.nextInt(0, 9);

        System.out.println(randomInt);



    }
}
