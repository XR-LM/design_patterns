package com.xr.principle.pattern.command;

/***
 * 抽象命令类
 * @author 零
 */
public abstract class Command {
    public Editor editor;

    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
