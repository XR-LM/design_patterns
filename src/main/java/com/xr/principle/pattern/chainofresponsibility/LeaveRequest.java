package com.xr.principle.pattern.chainofresponsibility;

/**
 * 请假条
 *
 * @author 零
 */
public class LeaveRequest {
    /**
     * 姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int day;

    /**
     * 请假内容
     */
    private String content;

    public LeaveRequest(String name, int day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getContent() {
        return content;
    }
}