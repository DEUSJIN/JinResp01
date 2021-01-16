package pers.jin.springmvc.beans;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/2 15:02
 */
public class Address {
    private String province;
    private String city;

    @Override
    public String
    toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public Address() {
    }
}
