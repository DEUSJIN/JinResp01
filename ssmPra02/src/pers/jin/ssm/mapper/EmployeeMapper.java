package pers.jin.ssm.mapper;

import pers.jin.ssm.beans.Employee;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/15 8:12
 */
public interface EmployeeMapper {
    List<Employee> getAll();
}
