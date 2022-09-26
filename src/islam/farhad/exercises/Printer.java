package islam.farhad.exercises;

/* This class is related to Generics demo class */

public class Printer <T> {

    T thingToPrint;

    Printer (T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    void print(){
        System.out.println(thingToPrint);
    }
}
