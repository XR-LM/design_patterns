package com.xr.principle.pattern.flyweight;

import java.awt.*;

/**
 * 包含多棵树共享的状态
 *
 * @author 零
 */
public class TreeType {
    /**
     * 名称
     */
    private String name;
    /**
     * 颜色
     */
    private Color color;
    /**
     * 其他相关数据
     */
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}