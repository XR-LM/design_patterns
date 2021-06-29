package com.xr.principle.pattern.chainofresponsibility;

/**
 * 部门经理
 *
 * @author 零
 */
public class OrganManager extends Handler {
    public OrganManager() {
        //部门经理处理3-7天的请假
        super(Handler.THREE_DAY, Handler.SEVEN_DAY);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("部门经理审批：同意。");
    }
}