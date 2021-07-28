package com.xr.principle.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        // 测试demo
        String shareType = "order";
        ShareStrategy shareStrategy = ShareFactory.getShareStrategy(shareType);
        shareStrategy.shareAlgorithm("single");
        // 输出结果：当前分享图片是order
    }
}
