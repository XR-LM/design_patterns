package com.xr.principle.pattern.chainofresponsibility;

/**
 * 小组长
 *
 * @author 零
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.ONE_DAY, Handler.THREE_DAY);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("小组长审批：同意。");
    }
}