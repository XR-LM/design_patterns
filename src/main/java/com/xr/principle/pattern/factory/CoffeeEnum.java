package com.xr.principle.pattern.factory;

/**
 * @author xiaorui
 * @date 2022-04-27 16:11
 */
public enum CoffeeEnum {

    Error("未知类型", 0),

    American("美式咖啡",1),

    Latte("美式咖啡",2);

    private String name;

    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    CoffeeEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
}
