package pers.jin.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.jin.spring.beans.Employee;

import java.util.Collection;
import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/7 19:43
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void save(Employee employee) {
        if(employee == null){
            return;
        }
        String sql = "insert into employee(id,lastName,email,gender,departmentId)values(?,?,?,?,?)";
        jdbcTemplate.update(sql,employee.getId(),employee.getLastName(),employee.getEmail(),employee.getGender(),employee.getDepartmentId());
    }

    @Override
    public Employee get(Integer id) {
        if(id == null){
            return null;
        }
        String sql = "select * from employee where id=?";
        BeanPropertyRowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> employees = jdbcTemplate.query(sql, rowMapper, id);
        return employees.size()==0?null:employees.get(0);
    }

    @Override
    public Collection<Employee> getAll() {
        String sql = "select * from employee";
        BeanPropertyRowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void delete(Integer id) {
        if(id == null){
            return;
        }
        String sql = "delete from employee where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(Integer id, Employee employee) {
        String sql = "update employee set id=?,lastName=?,email=?,gender=?,departmentId=? where id=?";
        jdbcTemplate.update(sql,employee.getId(),employee.getLastName(),employee.getEmail(),employee.getGender(),employee.getDepartmentId(),id );
    }
}
