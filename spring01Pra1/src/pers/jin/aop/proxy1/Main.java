package pers.jin.aop.proxy1;

import pers.jin.aop.proxy.ArithmeticCalculator;
import pers.jin.aop.proxy.ArithmeticCalculatorImpl;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 19:47
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticCalculatorProxy acp = new ArithmeticCalculatorProxy(new ArithmeticCalculatorImpl());
        ArithmeticCalculator proxy = (ArithmeticCalculator)acp.getProxy();
        proxy.add(1, 2);
    }
}
