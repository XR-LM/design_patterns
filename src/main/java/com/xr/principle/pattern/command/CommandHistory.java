package com.xr.principle.pattern.command;

import java.util.Stack;

/**
 * 命令历史
 *
 * @author 零
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}