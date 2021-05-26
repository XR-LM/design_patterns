package com.xr.principle.pattern.proxy.cglib_proxy;

/**
 * 测试类
 *
 * @author 零
 */
public class Test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while (true) {

        }
    }
}
