package com.xr.principle.pattern.iterator;

import com.xr.principle.pattern.prototype.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生聚合类具体实现
 *
 * @author 零
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator<Student> getStudentIterator() {
        return new StudentIteratorImpl<>(list);
    }
}