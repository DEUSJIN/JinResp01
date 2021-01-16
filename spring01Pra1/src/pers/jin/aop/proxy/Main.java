package pers.jin.aop.proxy;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/27 20:17
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        ArithmeticCalculatorProxy arithmeticCalculatorProxy = new ArithmeticCalculatorProxy(target);
        Object o = arithmeticCalculatorProxy.getProxy();
        ArithmeticCalculator proxy = (ArithmeticCalculator)o;
        proxy.add(3, 4);
    }
}
