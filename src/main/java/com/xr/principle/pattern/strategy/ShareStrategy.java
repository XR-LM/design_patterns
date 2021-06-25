package com.xr.principle.pattern.strategy;

/**
 * 分享策略
 *
 * @author 零
 */
public interface ShareStrategy {
    /**
     * 分享算法
     *
     * @param param 算法标识
     */
    void shareAlgorithm(String param);
}