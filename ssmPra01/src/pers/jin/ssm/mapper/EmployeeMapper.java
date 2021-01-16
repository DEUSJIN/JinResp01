package pers.jin.ssm.mapper;

import pers.jin.ssm.beans.Employee;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/13 16:08
 */
public interface EmployeeMapper {
    List<Employee> getAll();
}
