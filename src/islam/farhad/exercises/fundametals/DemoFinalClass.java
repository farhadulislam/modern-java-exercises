package islam.farhad.exercises.fundametals;

public final class DemoFinalClass {

    public static void main (String [] args){

        Rabbit rabbit1 = new Rabbit("Rabbit", "White");
        rabbit1.getInfo();

    }
}


class Animal {
    int age;
    String name;
    final static int NUMBER_OF_ANIMALS = 100;

    public Animal(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void getInfo(){
        System.out.println(this.getAge() + this.getName());
    }
}

class Rabbit extends Animal{
    String rabbit_species;
    public Rabbit(String name, String rabbit_species) {
        super(name);
        this.rabbit_species = rabbit_species;
    }



}