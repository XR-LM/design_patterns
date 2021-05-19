package com.xr.principle;

import java.awt.*;
import java.util.ArrayList;

public class Student {
    private String name;
    private Integer age;
    private ArrayList<Integer> scoreList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Integer> scoreList) {
        this.scoreList = scoreList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoreList=" + scoreList +
                '}';
    }
}
