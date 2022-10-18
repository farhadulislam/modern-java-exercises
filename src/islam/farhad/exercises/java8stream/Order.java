package islam.farhad.exercises.java8stream;

import java.io.Serializable;

public class Order implements Serializable {

    private Integer id;
    private Integer number;

    protected Order(){

    }
    public static Order of(Integer number){
       /* checkNotNull(number);
        checkArgument(number> 0);*/
        return new Order();
    }


}
