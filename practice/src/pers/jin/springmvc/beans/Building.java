package pers.jin.springmvc.beans;

import java.sql.Date;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 10:57
 */
public class Building {
    private Integer id;
    /**
     * 1.普通
     * 2.高端
     * 3.别墅
     */
    private Integer type;
    private Date date;
    private Double price;
    private Integer owner;
    private String remarks;
    private String community;
    private Integer size;
    /**
     * true：未售出
     * false：售出
     */
    private Boolean flag;

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", type=" + type +
                ", date=" + date +
                ", price=" + price +
                ", owner=" + owner +
                ", remarks='" + remarks + '\'' +
                ", community='" + community + '\'' +
                ", size=" + size +
                ", flag=" + flag +
                '}';
    }

    public Building(Integer id, Integer type, Date date, Double price, Integer owner, String remarks, String community, Integer size, Boolean flag) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.price = price;
        this.owner = owner;
        this.remarks = remarks;
        this.community = community;
        this.size = size;
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public Building() {
    }
}