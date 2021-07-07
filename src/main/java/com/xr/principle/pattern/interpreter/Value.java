package com.xr.principle.pattern.interpreter;

/**
 * 终结符表达式角色
 *
 * @author 零
 */
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
