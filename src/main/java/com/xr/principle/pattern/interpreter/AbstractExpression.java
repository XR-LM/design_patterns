package com.xr.principle.pattern.interpreter;

/**
 * 抽象角色AbstractExpression
 *
 * @author 零
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}