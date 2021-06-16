package com.xr.principle.pattern.decorator;

/**
 * 快餐类
 *
 * @author 零
 */
public abstract class FastFood {

    private float price;

    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算快餐价格
     *
     * @return 快餐价格
     */
    public abstract float cost();
}
