package com.xr.principle.pattern.chainofresponsibility;

/**
 * 处理者
 *
 * @author 零
 */
public abstract class Handler {
    protected final static int ONE_DAY = 1;
    protected final static int THREE_DAY = 3;
    protected final static int SEVEN_DAY = 7;

    /**
     * 最小天数
     */
    private int minDay;

    /**
     * 最大天数
     */
    private int maxDay;

    /**
     * 下一步处理角色
     */
    private Handler nextHandler;

    public Handler(int minDay) {
        this.minDay = minDay;
    }

    public Handler(int minDay, int maxDay) {
        this.minDay = minDay;
        this.maxDay = maxDay;
    }


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void submit(LeaveRequest request) {
        if (0 == this.minDay) {
            return;
        }
        if (request.getDay() >= this.minDay) {
            System.out.println(request.getName() + "请假" + request.getDay() + "天," + request.getContent() + "。");
            this.handleLeave(request);
            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if (null != this.nextHandler && request.getDay() > this.maxDay) {
                this.nextHandler.submit(request);
            } else {
                System.out.println("流程结束");
            }
        }
    }

    /**
     * 各级领导处理请假条方法
     *
     * @param leave 请假申请
     */
    protected abstract void handleLeave(LeaveRequest leave);
}
