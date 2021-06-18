package com.xr.principle.pattern.component;

/**
 * 菜单抽象类
 *
 * @author 零
 */
public abstract class MenuComponent {
    /**
     * 菜单名
     */
    protected String name;

    /**
     * 菜单层级
     */
    protected int level;


    /**
     * 添加菜单
     *
     * @param menuComponent 菜单项or菜单
     */
    public void addMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单
     *
     * @param menuComponent 菜单项or菜单
     */
    public void removeMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     *
     * @param i 层级
     * @return 菜单集合
     */
    public MenuComponent getMenuComponent(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    /**
     * 打印菜单
     */
    public void print() {
        throw new UnsupportedOperationException();
    }
}
