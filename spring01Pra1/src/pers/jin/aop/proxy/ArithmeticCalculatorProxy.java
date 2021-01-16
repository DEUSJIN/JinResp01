package pers.jin.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/27 20:11
 */
public class ArithmeticCalculatorProxy {
    private ArithmeticCalculator target;
    public ArithmeticCalculatorProxy(ArithmeticCalculator arithmeticCalculator){
        target = arithmeticCalculator;
    }
    public Object getProxy(){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + " begin:" + Arrays.asList(args));
                Object res = method.invoke(target, args);
                System.out.println(method.getName() + " end:" + res);
                return res;
            }
        });
        return proxy;
    }
}
