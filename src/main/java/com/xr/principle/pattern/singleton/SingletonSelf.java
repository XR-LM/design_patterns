package com.xr.principle.pattern.singleton;

/**
 * 线程安全的单例模式
 *
 * @author 零
 */
public class SingletonSelf {


    private SingletonSelf() {
    }

    private static volatile SingletonSelf SINGLETON_SELF;

    public static SingletonSelf getSingletonSelf() {
        if (SINGLETON_SELF == null) {
            synchronized (SingletonSelf.class) {
                if (SINGLETON_SELF == null) {
                    //new 对应的Class中 只包含了静态变量，静态方法，idea认为你没有必要去new 出来一个对象，所以进行了提示
                    return new SingletonSelf();
                }
            }
        }
        return SINGLETON_SELF;
    }
}
