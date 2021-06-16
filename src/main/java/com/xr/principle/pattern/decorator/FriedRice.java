package com.xr.principle.pattern.decorator;

/**
 * 炒饭类
 *
 * @author 零
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}