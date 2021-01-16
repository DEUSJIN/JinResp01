package pers.jin.spring.tx.annotation.service;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:35
 */
public interface BookShopService {
    /**
     * 买书
     * @param name 用户名
     * @param isbn 书号
     */
    void buyBook(String name,String isbn);
}
