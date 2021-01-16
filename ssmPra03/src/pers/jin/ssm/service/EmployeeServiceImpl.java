package pers.jin.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jin.ssm.beans.Employee;
import pers.jin.ssm.mapper.EmployeeMapper;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/16 21:18
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAll() {
        return employeeMapper.getEmps();
    }
}
