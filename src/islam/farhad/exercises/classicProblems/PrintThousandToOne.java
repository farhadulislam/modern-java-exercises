
package islam.farhad.exercises.classicProblems;

public class PrintThousandToOne {

    public static void main(String [] args){
        for (int i = 1000; i >= 0;  --i){
            System.out.print(i + "\t");
            if (i < 1000 && i%5==0){
                System.out.println();
            }
        }
        printTabbedNumbersByChatGPT();
    }

    public static void printTabbedNumbersByChatGPT() {
        System.out.println("100 to 1");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "\t");
            if ((100 - i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
