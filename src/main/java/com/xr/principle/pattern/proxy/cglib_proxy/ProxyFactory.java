package com.xr.principle.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理工厂
 *
 * @author 零
 */
public class ProxyFactory implements MethodInterceptor {

    TrainStation trainStation = new TrainStation();

    /**
     * 获取代理对象
     *
     * @return 代理对象
     */
    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(trainStation.getClass());
        enhancer.setCallback(this);
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取代理费");
        return method.invoke(trainStation, objects);
    }
}
