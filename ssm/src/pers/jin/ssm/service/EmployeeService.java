package pers.jin.ssm.service;

import org.springframework.stereotype.Service;
import pers.jin.ssm.beans.Employee;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/13 11:05
 */
public interface EmployeeService {
    List<Employee> getAllEmps();
}
