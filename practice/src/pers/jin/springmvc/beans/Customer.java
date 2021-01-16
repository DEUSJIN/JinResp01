package pers.jin.springmvc.beans;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 10:56
 */
public class Customer {
    private Integer id;
    private String password;
    private String name;
    private Integer gender;
    private Double balance;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer() {
    }

    public Customer(Integer id, String password, String name, Integer gender, Double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.balance = balance;
    }
}