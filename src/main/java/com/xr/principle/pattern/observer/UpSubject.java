package com.xr.principle.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * up猪
 *
 * @author 零
 */
public class UpSubject implements Subject {

    private final List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : userList) {
            observer.update(msg);
        }
    }
}
