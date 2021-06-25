package com.xr.principle.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 分享工厂
 *
 * @author 零
 */
public class ShareFactory {

    /**
     * 定义策略map缓存
     */
    private static final Map<String, ShareStrategy> shareStrategies = new HashMap<>();

    static {
        shareStrategies.put(ShareType.ORDER.getCode(), new OrderItemShare());
        shareStrategies.put(ShareType.SINGLE.getCode(), new SingleItemShare());
        shareStrategies.put(ShareType.MULTI.getCode(), new MultiItemShare());
    }


    public static ShareStrategy getShareStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return shareStrategies.get(type);
    }
}