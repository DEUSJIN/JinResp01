package pers.jin.helloword.beas;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/12 9:29
 */
public class CarFactoryBean implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        return new Car("宝马",300000.0,250.0);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
