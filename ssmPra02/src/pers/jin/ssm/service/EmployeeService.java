package pers.jin.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jin.ssm.beans.Employee;
import pers.jin.ssm.mapper.EmployeeMapper;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/15 8:12
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> getAll(){
        return employeeMapper.getAll();
    }
}
