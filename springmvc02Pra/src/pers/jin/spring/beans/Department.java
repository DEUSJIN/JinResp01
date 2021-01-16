package pers.jin.spring.beans;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/7 20:40
 */
public class Department {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
