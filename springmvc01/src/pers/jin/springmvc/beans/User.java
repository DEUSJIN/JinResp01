package pers.jin.springmvc.beans;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/2 15:01
 */
public class User {
    private String name;
    private String password;
    private Integer gender;
    private String email;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(String name, String password, Integer gender, String email, Address adress) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.address = adress;
    }


    public User() {
    }
}
