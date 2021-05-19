package com.xr.principle;

/**
 * 抽象皮肤类
 *
 * @author 零
 */
public abstract class AbstractSkin {

    /**
     * 切换皮肤
     */
    abstract void display();

    public void fillRequest() {
        System.out.println("public 方法");
    }
}
