package com.xr.principle.pattern.proxy.jdk_proxy;

/**
 * 测试类
 *
 * @author 零
 */
public class Test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
