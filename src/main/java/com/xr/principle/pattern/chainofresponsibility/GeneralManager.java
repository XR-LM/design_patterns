package com.xr.principle.pattern.chainofresponsibility;

/**
 * 总经理
 *
 * @author 零
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.SEVEN_DAY);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println("总经理审批：同意。");
    }
}