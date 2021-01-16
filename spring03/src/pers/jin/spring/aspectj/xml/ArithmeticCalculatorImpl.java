package pers.jin.spring.aspectj.xml;

import org.springframework.stereotype.Component;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 19:42
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public double multi(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }
}
