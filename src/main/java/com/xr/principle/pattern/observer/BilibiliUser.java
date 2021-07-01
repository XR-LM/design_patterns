package com.xr.principle.pattern.observer;

/**
 * bilibili用户
 *
 * @author 零
 */
public class BilibiliUser implements Observer {

    private final String username;

    public BilibiliUser(String username) {
        this.username = username;
    }

    @Override
    public void update(String msg) {
        System.out.printf("%s 你关注的up猪更新了：%s", username, msg);
        System.out.println();
    }
}
