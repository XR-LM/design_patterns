package com.xr.principle.pattern.interpreter;

/**
 * 终结符表达式角色 变量表达式
 *
 * @author 零
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}