package islam.farhad.exercises.data;

enum Screen {
    TOUCHSCREEN, KEY_WITH_TOUCHSCREEN, AMOLED, FLIP
}
public class CellPhone extends Phone {

    private String cellPhoneModel;
    private Screen screen;

    public CellPhone(String name, String model, String cellPhoneModel, Screen screen) {
        super(name, model);
        this.cellPhoneModel = cellPhoneModel;
        this.screen = screen;
    }

    @Override
    public void ring(){
        super.ring();
        System.out.println("Mobile phone rings");
    }
}
