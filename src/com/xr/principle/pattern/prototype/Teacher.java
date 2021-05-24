package com.xr.principle.pattern.prototype;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 教师类
 *
 * @author 零
 */
public class Teacher implements Cloneable, Serializable {

    private String name;

    List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        List<Student> students = teacher.getStudents().stream().map(student -> {
            try {
                return (Student) student.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return student;
        }).collect(Collectors.toList());
        teacher.setStudents(students);
        return teacher;
    }
}
