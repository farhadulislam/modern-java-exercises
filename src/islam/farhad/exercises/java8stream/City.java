package islam.farhad.exercises.java8stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    private String name;
    private List<Person> cityDwellers = new ArrayList<>();


    public City(String name, Person... people) {
        this.name = name;
        this.cityDwellers.addAll(Arrays.asList(people));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getCityDwellers() {
        return cityDwellers;
    }

    public void setCityDwellers(List<Person> cityDwellers) {
        this.cityDwellers = cityDwellers;
    }
}
