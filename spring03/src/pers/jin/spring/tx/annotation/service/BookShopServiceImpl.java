package pers.jin.spring.tx.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jin.spring.tx.annotation.dao.BookShopDao;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:36
 */
@Service
public class BookShopServiceImpl implements BookShopService {
    @Autowired
    private BookShopDao bookShopDao;
    @Override
    public void buyBook(String name, String isbn) {
        int price = bookShopDao.findPriceByIsbn(isbn);
        bookShopDao.updateStock(isbn);
        bookShopDao.updateUserAccount(name, price);
    }
}
