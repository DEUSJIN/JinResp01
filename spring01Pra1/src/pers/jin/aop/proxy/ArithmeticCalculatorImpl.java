package pers.jin.aop.proxy;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/27 20:09
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
