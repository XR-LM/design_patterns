package com.xr.principle.pattern.prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * 浅克隆测试类
 *
 * @author 零
 */
public class DeepCloneTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("张三");
        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        teacher.setStudents(students);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("F:\\teacher.txt"));
        objectOutputStream.writeObject(teacher);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\teacher.txt"));
        Teacher teacher1 = (Teacher) objectInputStream.readObject();
        objectInputStream.close();

        teacher1.getStudents().get(0).setName("里斯");
        System.out.println(teacher);
        System.out.println(teacher1);

    }
}
