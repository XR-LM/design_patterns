package com.xr.principle.pattern.chainofresponsibility;

/**
 * 测试类
 *
 * @author 零
 */
public class Client {
    public static void main(String[] args) {
        //请假条来一张
        LeaveRequest leave = new LeaveRequest("小花", 10, "身体不适");
        //各位领导
        GroupLeader groupLeader = new GroupLeader();
        OrganManager organManager = new OrganManager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(organManager);
        organManager.setNextHandler(generalManager);
        //提交申请
        groupLeader.submit(leave);
    }
}