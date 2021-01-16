package pers.jin.springmvc.dao;

import pers.jin.springmvc.beans.Customer;

import java.util.Collection;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 20:56
 */
public interface CustomerDao {
    Boolean save(Customer customer);
    Collection<Customer> getAll();
    Customer get(Integer id);
    void delete(Integer id);
}
