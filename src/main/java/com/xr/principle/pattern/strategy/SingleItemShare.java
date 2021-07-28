package com.xr.principle.pattern.strategy;

/**
 * 单商品分享
 *
 * @author 零
 */
@ShareStrategyAnnotation(type = "single")
public class SingleItemShare implements ShareStrategy {

    @Override
    public void shareAlgorithm(String param) {
        System.out.println("当前分享图片是" + param);
    }
}