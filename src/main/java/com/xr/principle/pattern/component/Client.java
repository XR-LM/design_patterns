package com.xr.principle.pattern.component;

/**
 * 客户端
 *
 * @author 零
 */
public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("角色管理", 2);
        MenuItem menuItem2 = new MenuItem("修改角色", 3);
        MenuItem menuItem3 = new MenuItem("角色列表", 3);
        MenuItem menuItem = new MenuItem("叶子节点", 4);
        Menu menuComponent = new Menu("新增角色", 3);
        menuComponent.addMenuComponent(menuItem);
        menu.addMenuComponent(menuComponent);
        menu.addMenuComponent(menuItem2);
        menu.addMenuComponent(menuItem3);
        Menu root = new Menu("系统管理", 1);
        root.addMenuComponent(menu);
        root.print();

    }
}
