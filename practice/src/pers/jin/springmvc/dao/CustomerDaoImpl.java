package pers.jin.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pers.jin.springmvc.beans.Customer;
import pers.jin.springmvc.exception.CustomerHasExist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 20:59
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    带查询主键是否重复
//    @Override
//    public Boolean save(Customer customer) {
//        System.out.println("=====");
//        String sql = "select *from customer where id=?";
//        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
//        if(jdbcTemplate.query(sql, rowMapper, customer.getId()).size()!=0){
//            return false;
//        }
//        sql = "insert into customer(id,password,name,gender,balance)values(?,?,?,?,?)";
//        jdbcTemplate.update(sql, customer.getId(),customer.getPassword(),customer.getName(),customer.getGender(),customer.getBalance());
//        return true;
//    }

    @Override
    public Boolean save(Customer customer) {
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        String sql = "insert into customer(password,name,gender,balance)values(?,?,?,?)";
        jdbcTemplate.update(sql, customer.getPassword(),customer.getName(),customer.getGender(),customer.getBalance());
        return true;
    }
    @Override
    public Collection<Customer> getAll() {
        String sql = "select *from customer";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        List<Customer> list = jdbcTemplate.query(sql, rowMapper);
        return list;
    }

    @Override
    public Customer get(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
