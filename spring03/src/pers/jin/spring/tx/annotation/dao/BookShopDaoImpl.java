package pers.jin.spring.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.jin.spring.tx.annotation.exception.BalanceException;
import pers.jin.spring.tx.annotation.exception.BookStockException;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:24
 */
@Repository
public class BookShopDaoImpl implements BookShopDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findPriceByIsbn(String isbn) {
        String sql = "select price from tbl_book where isbn=?";
        return jdbcTemplate.queryForObject(sql, Integer.class,isbn);
    }

    @Override
    public void updateStock(String isbn) {
        String sql = "select stock from tbl_book_stock where isbn=?";
        int cnt = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
        if(cnt <= 0){
            throw new BookStockException("库存不足......");
        }
        sql = "update tbl_book_stock set stock=stock-1 where isbn=?";
        jdbcTemplate.update(sql,isbn);
    }

    @Override
    public void updateUserAccount(String username, Integer price) {
        String sql = "select balance from tbl_employee where name=?";
        int balance = jdbcTemplate.queryForObject(sql, Integer.class, username);
        if(balance <price){
            throw new BalanceException("余额不足......");
        }
        sql = "update tbl_employee set balance=balance-? where name=?";
        jdbcTemplate.update(sql,price,username );
    }
}
