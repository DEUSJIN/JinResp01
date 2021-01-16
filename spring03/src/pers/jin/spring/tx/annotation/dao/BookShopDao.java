package pers.jin.spring.tx.annotation.dao;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:21
 */
public interface BookShopDao {
    /**
     * 根据书号查询价格
     * @param isbn 书号
     * @return 价格
     */
    int findPriceByIsbn(String isbn);

    /**
     * 更新库存
     * @param isbn 书号
     */
    void updateStock(String isbn);

    /**
     * 更新用户余额
     * @param username 用户名
     * @param price 书的价格
     */
    void updateUserAccount(String username,Integer price);

}
