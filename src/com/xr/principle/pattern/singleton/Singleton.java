package com.xr.principle.pattern.singleton;

/**
 * 单例模式 恶汉模式
 *
 * @author 零
 */
public class Singleton {
    private Singleton() {
    }

    private final static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
