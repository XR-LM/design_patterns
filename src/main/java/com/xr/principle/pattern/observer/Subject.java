package com.xr.principle.pattern.observer;

/**
 * 抽象主题类
 *
 * @author 零
 */
public interface Subject {
    /**
     * 添加订阅
     *
     * @param observer 观众
     */
    void attach(Observer observer);

    /**
     * 移除订阅
     *
     * @param observer 观众
     */
    void detach(Observer observer);

    /**
     * 发布更新
     *
     * @param msg 消息内容
     */
    void notify(String msg);

}
