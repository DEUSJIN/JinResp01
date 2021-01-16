package pers.jin.aop.proxy1;

import pers.jin.aop.proxy.ArithmeticCalculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 19:43
 */
public class ArithmeticCalculatorProxy {
    private ArithmeticCalculator target;

    public ArithmeticCalculatorProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Object o = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method:" + method.getName() + ", args:" + Arrays.asList(args));
                Object res = method.invoke(target, args);
                System.out.println("method:" + method.getName() + ", result:" + res);
                return res;
            }
        });
        return o;
    }
}
