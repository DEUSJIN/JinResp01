package pers.jin.helloworld.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/7 14:29
 */
public class Student {
    private List<Car> carList = new ArrayList<>();
    public String sayHello(){
        return name+" say Hello";
    }

    @Override
    public String toString() {
        return "Student{" +
                "carList=" + carList +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Student(List<Car> carList, String name) {
        this.carList = carList;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName:" + name);
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    private String name="";

}
