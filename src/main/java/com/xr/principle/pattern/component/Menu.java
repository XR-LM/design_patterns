package com.xr.principle.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 *
 * @author 零
 */
public class Menu extends MenuComponent {

    List<MenuComponent> menuComponentList;

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void addMenuComponent(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void removeMenuComponent(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getMenuComponent(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
