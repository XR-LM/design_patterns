package com.xr.principle.pattern.decorator;

/**
 * 炒面类
 *
 * @author 零
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}