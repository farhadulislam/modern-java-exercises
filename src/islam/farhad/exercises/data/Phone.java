package islam.farhad.exercises.data;

public class Phone {

    private String name;
    private String model;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Phone() {
    }

    public void ring (){
        System.out.println("Ring when someone calls");
    }


    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
