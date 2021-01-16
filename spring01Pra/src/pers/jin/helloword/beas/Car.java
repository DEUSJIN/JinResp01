package pers.jin.helloword.beas;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/12 9:07
 */
public class Car implements BeanPostProcessor {
    private String brand;
    private Double price;
    private Double speed;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Car(String brand, Double price, Double speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public Car() {
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(brand + "postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(brand + "postProcessAfterInitialization");
        return bean;
    }
}
