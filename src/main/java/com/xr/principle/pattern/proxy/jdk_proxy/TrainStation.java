package com.xr.principle.pattern.proxy.jdk_proxy;

import com.xr.principle.pattern.proxy.jdk_proxy.SellTickets;

/**
 * 火车站  火车站具有卖票功能，所以需要实现SellTickets接口
 *
 * @author 零
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}