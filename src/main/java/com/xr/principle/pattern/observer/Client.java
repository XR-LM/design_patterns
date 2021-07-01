package com.xr.principle.pattern.observer;

/**
 * 客户端
 *
 * @author 零
 */
public class Client {
    public static void main(String[] args) {
        BilibiliUser lm = new BilibiliUser("丢你蕾姆");
        BilibiliUser wtw = new BilibiliUser("五条悟");

        UpSubject up = new UpSubject();
        up.attach(lm);
        up.attach(wtw);

        up.notify("关于我转世成为一只蜘蛛第五集");
    }
}
