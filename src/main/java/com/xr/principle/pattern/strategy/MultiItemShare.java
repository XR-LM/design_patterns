package com.xr.principle.pattern.strategy;

/**
 * 多商品分享
 *
 * @author 零
 */
@ShareStrategyAnnotation(type = ShareType.MULTI)
public class MultiItemShare implements ShareStrategy {

    @Override
    public void shareAlgorithm(String param) {
        System.out.println("当前分享图片是" + param);
    }
}