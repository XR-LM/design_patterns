package com.xr.principle.pattern.flyweight;

import java.awt.*;

/**
 * 树的独特状态
 *
 * @author 零
 */
public class Tree {
    /**
     * x轴坐标
     */
    private int x;
    /**
     * y轴坐标
     */
    private int y;
    /**
     * 享元数据
     */
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}