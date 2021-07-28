package com.xr.principle.pattern.strategy;

/**
 * 订单分享
 *
 * @author 零
 */
@ShareStrategyAnnotation(type = "order")
public class OrderItemShare implements ShareStrategy {

    @Override
    public void shareAlgorithm(String param) {
        System.out.println("当前分享图片是" + param);
    }
}