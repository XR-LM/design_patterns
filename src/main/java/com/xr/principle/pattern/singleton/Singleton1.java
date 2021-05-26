package com.xr.principle.pattern.singleton;

/**
 * 通过静态内部类的方式实现单例模式
 *
 * @author 零
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static class SingleHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public Singleton1 getInstance() {
        return SingleHolder.INSTANCE;
    }

}
