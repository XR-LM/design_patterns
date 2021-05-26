package com.xr.principle.pattern.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * jdk代理工厂
 *
 * @author 零
 */
public class ProxyFactory {
    private final TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
         /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ：   类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ：真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ：  代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), (object, method, args) -> {
            /*
                InvocationHandler中invoke方法参数说明：
                    proxy ： 代理对象
                    method ：对应于在代理对象上调用的接口方法的 Method 实例
                    args ：  代理对象调用接口方法时传递的实际参数
             */
            System.out.println("收取服务费");
            return method.invoke(trainStation);
        });
    }
}
