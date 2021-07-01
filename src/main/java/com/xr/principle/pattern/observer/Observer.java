package com.xr.principle.pattern.observer;

/**
 * 观察者接口
 *
 * @author 零
 */
public interface Observer {

    /**
     * 更新消息
     *
     * @param msg 消息内容
     */
    void update(String msg);
}
