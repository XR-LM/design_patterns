package com.xr.principle.pattern.proxy.cglib_proxy;

import java.io.*;

/**
 * 测试类
 *
 * @author 零
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());

        FileInputStream inputStream = new FileInputStream(new File("F:\\1.txt"));
    }
}
