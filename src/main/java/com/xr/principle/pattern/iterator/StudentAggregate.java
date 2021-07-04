package com.xr.principle.pattern.iterator;

import com.xr.principle.pattern.prototype.Student;

/**
 * 学生聚合类
 *
 * @author 零
 */
public interface StudentAggregate {
    /**
     * 添加学生
     *
     * @param student 学生
     */
    void addStudent(Student student);

    /**
     * 移除学生
     *
     * @param student 学生
     */
    void removeStudent(Student student);

    /**
     * 获取学生聚合类迭代器对象
     *
     * @return 迭代器
     */
    StudentIterator<Student> getStudentIterator();
}