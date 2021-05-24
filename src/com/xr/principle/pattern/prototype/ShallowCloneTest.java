package com.xr.principle.pattern.prototype;

import java.util.ArrayList;

/**
 * 浅克隆测试类
 *
 * @author 零
 */
public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        teacher.setStudents(students);
        System.out.println(teacher.toString());
        Teacher clone = teacher.clone();
        clone.students.get(0).setName("李四");
        System.out.println(teacher.toString());
        System.out.println(clone.toString());
    }
}
