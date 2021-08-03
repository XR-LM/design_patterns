package com.xr.principle.pattern.strategy;

/**
 * 分享工厂
 *
 * @author 零
 */
public enum ShareType {
    SINGLE("single", "单商品"),
    MULTI("multi", "多商品"),
    ORDER("order", "下单");
    // 场景对应的编码
    private String code;

    // 业务场景描述
    private String desc;

    ShareType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}