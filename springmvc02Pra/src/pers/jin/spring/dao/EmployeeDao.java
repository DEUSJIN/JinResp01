package pers.jin.spring.dao;

import pers.jin.spring.beans.Employee;

import java.util.Collection;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/7 19:42
 */
public interface EmployeeDao {
    void save(Employee employee);
    Employee get(Integer id);
    Collection<Employee>getAll();
    void delete(Integer id);
    void update(Integer id,Employee employee);
}
