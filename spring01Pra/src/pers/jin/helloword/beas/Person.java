package pers.jin.helloword.beas;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/12 9:07
 */
public class Person {
    private String name;
    private List<Car> carList = new ArrayList<>();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", carList=" + carList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Person() {
    }

    public Person(String name, List<Car> carList) {
        this.name = name;
        this.carList = carList;
    }
}
